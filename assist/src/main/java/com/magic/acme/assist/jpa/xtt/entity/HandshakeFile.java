package com.magic.acme.assist.jpa.xtt.entity;
// Generated 2017-6-22 10:27:00 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HandshakeFile generated by hbm2java
 */
@Entity
@Table(name = "handshake_file", schema = "public")
public class HandshakeFile implements java.io.Serializable {

    private long id;
    private String handshakeId;
    private String fileId;
    private String fileName;
    private Long size;

    private Handshake handshake;

    public HandshakeFile() {
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "handshake_id", insertable = false, updatable = false)
    public String getHandshakeId() {
        return this.handshakeId;
    }

    public void setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
    }

    @Column(name = "file_id", nullable = false)
    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Column(name = "file_name", nullable = false)
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

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "handshake_id", nullable = false)
    public Handshake getHandshake() {
        return handshake;
    }

    public void setHandshake(Handshake handshake) {
        this.handshake = handshake;
    }
}
