package com.manage.base.exception;


import com.manage.base.enums.ApiMessage;

public class AuthorizedException extends ApiExeception {

    public AuthorizedException(){
        setApiMessage(ApiMessage.ACCESS_DENIED);
    }
}
