package com.manage.kernel.core.admin.service.comm;

import com.manage.kernel.core.admin.model.UploadModel;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by bert on 2017/9/1.
 */
public interface IFileImageService {

    public UploadModel uploadImage(MultipartFile multipartFile);
}