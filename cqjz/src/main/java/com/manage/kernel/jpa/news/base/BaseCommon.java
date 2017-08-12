package com.manage.kernel.jpa.news.base;

import com.manage.base.extend.converter.StatusAttributeConverter;
import com.manage.base.extend.enums.Status;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseCommon {

    @Column(name = "status", length = 2)
    @Convert(converter = StatusAttributeConverter.class)
    private Status status;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "created_at")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private Long udpatedBy;

    @Column(name = "updated_at")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private LocalDateTime updatedAt;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUdpatedBy() {
        return udpatedBy;
    }

    public void setUdpatedBy(Long udpatedBy) {
        this.udpatedBy = udpatedBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
