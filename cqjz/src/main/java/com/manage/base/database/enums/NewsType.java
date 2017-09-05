package com.manage.base.database.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.manage.base.database.model.DBEnum;
import com.manage.base.database.model.Localisable;

/**
 * Created by bert on 2017/9/3.
 */
public enum NewsType implements DBEnum, Localisable {

    TPXW(10, "resource.constant.news.type.tpxw", true),// 图片新闻
    JQKX(11, "resource.constant.news.type.jqkx", false),//警情快讯
    DWJS(12, "resource.constant.news.type.dwjs", false),//队伍建设
    BMDT(13, "resource.constant.news.type.bmdt", false),//部门动态
    XXYD(14, "resource.constant.news.type.xxyd", false),//学习园地
    WHSB(15, "resource.constant.news.type.whsb", false),//网海拾贝
    KJLW(16, "resource.constant.news.type.kjlw", false),//科技瞭望
    JZFC(17, "resource.constant.news.type.jzfc", true),//技侦风采
    ;

    private int constant;
    private String messageKey;
    private boolean hasImage;

    NewsType(int constant, String messageKey, boolean hasImage) {
        this.constant = constant;
        this.messageKey = messageKey;
        this.hasImage = hasImage;
    }

    @Override
    public Integer getConstant() {
        return constant;
    }

    @Override
    public String messageKey() {
        return messageKey;
    }

    public boolean hasImage() {
        return hasImage;
    }


}