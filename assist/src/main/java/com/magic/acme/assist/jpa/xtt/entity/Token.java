package com.magic.acme.assist.jpa.xtt.entity;
// Generated 2017-6-22 10:27:00 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Token generated by hbm2java
 */
@Entity
@Table(name = "java", schema = "public")
public class Token implements java.io.Serializable {

    private String id;
    private Date creationDate;
    private Date expirationDate;
    private long issuingCompanyId;
    private boolean notifyOnException;
    private boolean notifyOnOrderDelivery;
    private boolean notifyOnOrderPickup;
    private Long orderId;
    private String ownerEmail;
    private Long ownerOtmsUserId;
    private Integer ownerRole;
    private int type;
    private String container;
    private boolean recalled;
    private String barcodeNumber;
    private String driverToken;
    private String shipperToken;
    private String consigneeToken;
    private Integer notifyType;

    public Token() {
    }
    public Token(String id) {
        this.id = id;
    }
    @Id
    @Column(name = "id", unique = true, nullable = false)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", nullable = false, length = 29)
    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expiration_date", nullable = false, length = 29)
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Column(name = "issuing_company_id", nullable = false)
    public long getIssuingCompanyId() {
        return this.issuingCompanyId;
    }

    public void setIssuingCompanyId(long issuingCompanyId) {
        this.issuingCompanyId = issuingCompanyId;
    }

    @Column(name = "notify_on_exception", nullable = false)
    public boolean isNotifyOnException() {
        return this.notifyOnException;
    }

    public void setNotifyOnException(boolean notifyOnException) {
        this.notifyOnException = notifyOnException;
    }

    @Column(name = "notify_on_order_delivery", nullable = false)
    public boolean isNotifyOnOrderDelivery() {
        return this.notifyOnOrderDelivery;
    }

    public void setNotifyOnOrderDelivery(boolean notifyOnOrderDelivery) {
        this.notifyOnOrderDelivery = notifyOnOrderDelivery;
    }

    @Column(name = "notify_on_order_pickup", nullable = false)
    public boolean isNotifyOnOrderPickup() {
        return this.notifyOnOrderPickup;
    }

    public void setNotifyOnOrderPickup(boolean notifyOnOrderPickup) {
        this.notifyOnOrderPickup = notifyOnOrderPickup;
    }

    @Column(name = "order_id")
    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Column(name = "owner_email", nullable = false)
    public String getOwnerEmail() {
        return this.ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    @Column(name = "owner_otms_user_id")
    public Long getOwnerOtmsUserId() {
        return this.ownerOtmsUserId;
    }

    public void setOwnerOtmsUserId(Long ownerOtmsUserId) {
        this.ownerOtmsUserId = ownerOtmsUserId;
    }

    @Column(name = "owner_role")
    public Integer getOwnerRole() {
        return this.ownerRole;
    }

    public void setOwnerRole(Integer ownerRole) {
        this.ownerRole = ownerRole;
    }

    @Column(name = "type", nullable = false)
    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Column(name = "container")
    public String getContainer() {
        return this.container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Column(name = "recalled", nullable = false)
    public boolean isRecalled() {
        return this.recalled;
    }

    public void setRecalled(boolean recalled) {
        this.recalled = recalled;
    }

    @Column(name = "barcode_number", length = 13)
    public String getBarcodeNumber() {
        return this.barcodeNumber;
    }

    public void setBarcodeNumber(String barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    @Column(name = "driver_token")
    public String getDriverToken() {
        return this.driverToken;
    }

    public void setDriverToken(String driverToken) {
        this.driverToken = driverToken;
    }

    @Column(name = "shipper_token")
    public String getShipperToken() {
        return this.shipperToken;
    }

    public void setShipperToken(String shipperToken) {
        this.shipperToken = shipperToken;
    }

    @Column(name = "consignee_token")
    public String getConsigneeToken() {
        return this.consigneeToken;
    }

    public void setConsigneeToken(String consigneeToken) {
        this.consigneeToken = consigneeToken;
    }

    @Column(name = "notify_type")
    public Integer getNotifyType() {
        return this.notifyType;
    }

    public void setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
    }

}
