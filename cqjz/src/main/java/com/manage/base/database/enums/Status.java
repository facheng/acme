package com.manage.base.database.enums;

import com.manage.base.database.model.DBEnum;
import com.manage.base.database.model.Localizable;

public enum Status implements DBEnum, Localizable {

    INIT(0, "resource.constant.data.status.init"),
    ENABLE(1, "resource.constant.data.status.enabled"),
    DISABLE(2, "resource.constant.data.status.disabled"),
    DELETE(3, "resource.constant.data.status.deleted"),
    EXPIRE(4, "resource.constant.data.status.expired");
    private int constant;
    private String messageKey;

    Status(int constant, String messageKey) {
        this.constant = constant;
        this.messageKey = messageKey;
    }

    @Override
    public Integer getConstant() {
        return this.constant;
    }

    @Override
    public String messageKey() {
        return messageKey;
    }

    public boolean isEnabled() {
        return this == INIT || this == ENABLE;
    }
}
