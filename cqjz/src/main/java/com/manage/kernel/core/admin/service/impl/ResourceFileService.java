package com.manage.kernel.core.admin.service.impl;

import com.manage.base.exception.FileUploadException;
import com.manage.base.extend.enums.FileSource;
import com.manage.base.utils.Constants;
import com.manage.base.utils.FileUtils;
import com.manage.kernel.core.admin.dto.FileDto;
import com.manage.kernel.core.admin.model.FileModel;
import com.manage.kernel.core.admin.parser.FileParser;
import com.manage.kernel.core.admin.service.IResourceFileService;
import com.manage.kernel.jpa.news.entity.ResourceFile;
import com.manage.kernel.jpa.news.repository.ResourceFileRepo;
import com.manage.kernel.spring.PropertySupplier;
import com.manage.kernel.spring.comm.ServiceBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.util.StreamUtils;

/**
 * Created by bert on 17-8-25.
 */
@Service
public class ResourceFileService extends ServiceBase implements IResourceFileService {

    private final static Logger LOGGER = LogManager.getLogger(ResourceFileService.class);

    @Autowired
    private PropertySupplier supplier;

    @Autowired
    private ResourceFileRepo resourceFileRepo;

    @Override
    @Transactional
    public FileDto upload(FileModel fileModel) {

        String localDir = localDir(fileModel.getFileSource());
        String extensionName = FileUtils.extensionName(fileModel.getFileName());
        String fileName = FileUtils.generateName(extensionName);
        String fullPath = localDir + fileName;
        String accessUrl = supplier.getFileTempDir() + Constants.SEPARATOR + fileName;
        try {
            FileUtils.save(fileModel.getInputStream(), fullPath);
        } catch (Exception e) {
            LOGGER.warn("File upload failed");
            throw new FileUploadException();
        }
        copyToTempDir(fullPath, accessUrl);
        ResourceFile resourceFile = new ResourceFile();
        resourceFile.setFileId(FileUtils.generateFileId());
        resourceFile.setFileName(fileName);
        resourceFile.setOriginName(fileModel.getFileName());
        resourceFile.setExtension(extensionName);
        resourceFile.setLocalPath(fullPath.substring(supplier.getFileUploadLocal().length()));
        resourceFile.setAccessUrl(supplier.getFileServiceUrl() + accessUrl);
        resourceFile.setType(fileModel.getFileType());
        resourceFile.setSource(fileModel.getFileSource());
        resourceFile.setFileSize(fileModel.getFileSize());
        resourceFile.setCreatedAt(LocalDateTime.now());
        resourceFileRepo.save(resourceFile);
        return FileParser.toFileDto(resourceFile);
    }


    @Override
    public FileDto getImage(String fileId) {

        ResourceFile resourceFile = resourceFileRepo.findByFileId(fileId);
        if (resourceFile == null) {
            return null;
        }

        FileDto fileDto = new FileDto();
        fileDto.setAccessUrl(resourceFile.getAccessUrl());
        return fileDto;
    }

    private String localDir(FileSource source) {
        StringBuilder path = new StringBuilder();
        path.append(supplier.getFileUploadLocal());
        path.append(Constants.SEPARATOR);
        path.append(source.getDir());
        path.append(Constants.SEPARATOR);
        path.append(LocalDate.now().toString("yyyyMMdd"));
        path.append(Constants.SEPARATOR);
        File sourceFile = new File(path.toString());
        if (!sourceFile.exists()) {
            sourceFile.mkdirs();
        }
        return path.toString();
    }

    private void copyToTempDir(String fullPath, String accessUrl) {
        String tempPath = tempPath();
        String filePath = tempPath + accessUrl;
        File image = new File(filePath);
        if (image.exists()) {
            return;
        }
        File originFile = new File(fullPath);
        if (!originFile.exists()) {
            LOGGER.warn("Origin file is not exists");
            throw new FileUploadException();
        }
        boolean result = FileUtils.copyFile(originFile, image);
        if (!result) {
            LOGGER.warn("Copy file failed");
            throw new FileUploadException();
        }
    }

    private String tempPath() {
        return ClassUtils.getDefaultClassLoader().getResource(Constants.IMAGE_PATH).getPath();
    }
}