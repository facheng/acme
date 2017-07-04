package com.manage.news.spring.annotation;

import com.manage.base.enums.Privilege;
import com.manage.base.enums.PrivilegeGroup;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenPermission {

    Privilege value();

    PrivilegeGroup group() default PrivilegeGroup.DEFAULT;

}
