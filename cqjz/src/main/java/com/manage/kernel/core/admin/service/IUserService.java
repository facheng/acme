package com.manage.kernel.core.admin.service;

import com.manage.base.atomic.Pair;
import com.manage.kernel.dto.UserDto;
import com.manage.kernel.jpa.news.entity.User;

import java.util.List;

public interface IUserService {

    void add(UserDto userDto);

    void modify(UserDto userDto);

    Pair<User, List<Long>> authUserDetail(String account);
}