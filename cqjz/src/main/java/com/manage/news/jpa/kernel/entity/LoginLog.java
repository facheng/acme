package com.manage.news.jpa.kernel.entity;

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

@Entity
@Table(name = "admin_login_log")
@SequenceGenerator(name = "seq_admin_login_log", sequenceName = "seq_admin_login_log")
public class LoginLog {

    @Id
    @GeneratedValue(generator = "seq_admin_login_log", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "account")
    private String account;

    @Column(name = "client_ip")
    private String clientIP;

    @Column(name = "message")
    private String message;

    @Column(name = "login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
