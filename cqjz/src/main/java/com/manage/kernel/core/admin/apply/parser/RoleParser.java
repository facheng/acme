package com.manage.kernel.core.admin.apply.parser;

import com.manage.kernel.core.admin.apply.dto.RoleDto;
import com.manage.kernel.jpa.entity.AdRole;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bert on 17-8-15.
 */
public class RoleParser {

    public static RoleDto toRoleDto(AdRole role) {
        return toRoleDto(role, new RoleDto());
    }

    public static List<RoleDto> toRoleDtoList(List<AdRole> roles) {
        List<RoleDto> roleDtos = new ArrayList<>();
        for (AdRole role : roles) {
            roleDtos.add(toRoleDto(role, new RoleDto()));
        }
        return roleDtos;
    }

    private static RoleDto toRoleDto(AdRole role, RoleDto roleDto) {
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        roleDto.setDescription(role.getDescription());
        roleDto.setCreatedAt(role.getCreatedAt());
        roleDto.setCreatedBy(role.getCreatedUserName());
        roleDto.setUpdatedAt(role.getUpdatedAt());
        roleDto.setUpdatedBy(role.getUpdatedUserName());
        return roleDto;
    }
}
