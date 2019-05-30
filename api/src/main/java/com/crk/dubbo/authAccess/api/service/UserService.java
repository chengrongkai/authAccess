package com.crk.dubbo.authAccess.api.service;

import com.crk.dubbo.authAccess.api.request.UserQueryDto;
import com.crk.dubbo.authAccess.api.response.BaseResponse;

/**
 * @author chengrongkai
 * @description: TODO 用户服务
 * @date 2019/5/30 22:22
 */
public interface UserService {
    /**
     * 查询用户列表
     * @param userQueryDto 用户查询实体
     * @return 查询结果
     */
    BaseResponse queryUserList(UserQueryDto userQueryDto);
}
