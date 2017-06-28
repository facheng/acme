package com.magic.acme.assist.jpa.xtt.entity;
// Generated 2017-6-22 15:59:44 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;

/**
 * EpodTask generated by hbm2java
 */
@Entity
@Table(name = "epod_task", schema = "public")
//@SequenceGenerator(name = "seq_epod_task", sequenceName = "seq_epod_task")
public class EpodTask implements java.io.Serializable {

    private Long id;
    private Integer version;
    private Date createdAt;
    private Date updateAt;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer updateSource;
    private Boolean isUploadByHandshake;
    private String performedBy;
    private Integer status;
    private Integer retryCount;
    private Integer taskType;
    private Long orderId;
    private String fileId;
    private String fileName;
    private Long size;
    private String batchId;
    private String originMilestone;
    private String requestMilestone;
    private String finalMilestone;
    private Integer driverExceptionType;
    private Boolean ackFlag;
    private Date entryDate;
    private Date updateDate;
    private Integer batchOperationType;
    private String phone;
    private Integer role;
    private Long companyId;
    private Integer fileType;
    private Integer exceptionType;
    private String milestoneNumber;
    private Date uploadedAt;
    private String owner;
    private String relationId;
    private String orderNumber;
    private Integer totalCount;

    public EpodTask() {
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_epod_task")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", length = 29)
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at", length = 29)
    public Date getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Column(name = "latitude", precision = 1000, scale = 0)
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", precision = 1000, scale = 0)
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Column(name = "update_source")
    public Integer getUpdateSource() {
        return this.updateSource;
    }

    public void setUpdateSource(Integer updateSource) {
        this.updateSource = updateSource;
    }

    @Column(name = "is_upload_by_handshake")
    public Boolean getIsUploadByHandshake() {
        return this.isUploadByHandshake;
    }

    public void setIsUploadByHandshake(Boolean isUploadByHandshake) {
        this.isUploadByHandshake = isUploadByHandshake;
    }

    @Column(name = "performed_by")
    public String getPerformedBy() {
        return this.performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    @Column(name = "status")
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "retry_count")
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    @Column(name = "task_type")
    public Integer getTaskType() {
        return this.taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    @Column(name = "order_id")
    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Column(name = "file_id")
    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Column(name = "file_name")
    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name = "size")
    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Column(name = "batch_id")
    public String getBatchId() {
        return this.batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Column(name = "origin_milestone")
    public String getOriginMilestone() {
        return this.originMilestone;
    }

    public void setOriginMilestone(String originMilestone) {
        this.originMilestone = originMilestone;
    }

    @Column(name = "request_milestone")
    public String getRequestMilestone() {
        return this.requestMilestone;
    }

    public void setRequestMilestone(String requestMilestone) {
        this.requestMilestone = requestMilestone;
    }

    @Column(name = "final_milestone")
    public String getFinalMilestone() {
        return this.finalMilestone;
    }

    public void setFinalMilestone(String finalMilestone) {
        this.finalMilestone = finalMilestone;
    }

    @Column(name = "driver_exception_type")
    public Integer getDriverExceptionType() {
        return this.driverExceptionType;
    }

    public void setDriverExceptionType(Integer driverExceptionType) {
        this.driverExceptionType = driverExceptionType;
    }

    @Column(name = "ack_flag")
    public Boolean getAckFlag() {
        return this.ackFlag;
    }

    public void setAckFlag(Boolean ackFlag) {
        this.ackFlag = ackFlag;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date", length = 29)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 29)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "batch_operation_type")
    public Integer getBatchOperationType() {
        return this.batchOperationType;
    }

    public void setBatchOperationType(Integer batchOperationType) {
        this.batchOperationType = batchOperationType;
    }

    @Column(name = "phone")
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "role")
    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Column(name = "company_id")
    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Column(name = "file_type")
    public Integer getFileType() {
        return this.fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    @Column(name = "exception_type")
    public Integer getExceptionType() {
        return this.exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Column(name = "milestone_number")
    public String getMilestoneNumber() {
        return this.milestoneNumber;
    }

    public void setMilestoneNumber(String milestoneNumber) {
        this.milestoneNumber = milestoneNumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "uploaded_at", length = 29)
    public Date getUploadedAt() {
        return this.uploadedAt;
    }

    public void setUploadedAt(Date uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    @Column(name = "owner")
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Column(name = "relation_id")
    public String getRelationId() {
        return this.relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    @Column(name = "order_number")
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Column(name = "total_count")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}
