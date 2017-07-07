package com.manage.news.core.admin.api;

import com.manage.base.bean.ResponseInfo;
import com.manage.base.enums.PrivilegeGroup;
import com.manage.base.enums.ResponseEnum;
import com.manage.cache.bean.TokenUser;
import com.manage.news.core.admin.service.UserService;
import com.manage.news.dto.UserDto;
import com.manage.news.spring.BaseServiceApi;
import com.manage.news.spring.annotation.TokenCheck;
import com.manage.news.spring.annotation.TokenPermission;
import com.manage.news.spring.annotation.TokenPermissionGroup;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "User", tags = "User manage")
@RequestMapping(value = "/admin/user", consumes = "application/json", produces = "application/json")
@TokenPermissionGroup(PrivilegeGroup.USER)
public class UserApi extends BaseServiceApi {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResponseInfo login(String user, String password){
        TokenUser tokenUser = new TokenUser();
        tokenUser.setAccount(user);
        ResponseInfo response = new ResponseInfo();
        response.setStatus(ResponseEnum.SUCCESS);
        userService.login(user, password);
        return response;
    }

    @TokenCheck
    @RequestMapping("/register")
    public ResponseInfo register(UserDto userDto){

        ResponseInfo response = new ResponseInfo();
        userService.add(userDto);
        return response;
    }
}