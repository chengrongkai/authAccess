package com.crk.dubbo.authAccess.model.dao;

import com.crk.dubbo.authAccess.api.request.UserQueryDto;
import com.crk.dubbo.authAccess.model.entity.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询所有用户
     * @param userQueryDto
     * @return
     */
    List<SysUser> queryUserList(UserQueryDto userQueryDto);
}