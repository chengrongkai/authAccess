package com.crk.dubbo.authAccess.server.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.crk.dubbo.authAccess.api.enums.StatusCode;
import com.crk.dubbo.authAccess.api.request.UserQueryDto;
import com.crk.dubbo.authAccess.api.response.BaseResponse;
import com.crk.dubbo.authAccess.api.service.UserService;
import com.crk.dubbo.authAccess.model.dao.SysUserMapper;
import com.crk.dubbo.authAccess.model.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author chengrongkai
 * @description: TODO
 * @date 2019/5/3022:22
 */
@Service(protocol = {"dubbo","rest"},validation = "true",version = "1.0",timeout = 3000)
@Path("user")
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询用户列表
     *
     * @param userQueryDto 用户查询实体
     * @return 查询结果
     */
    @Path("users")
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public BaseResponse queryUserList(UserQueryDto userQueryDto) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.Success);
        try{
            List<SysUser> userList = sysUserMapper.queryUserList(userQueryDto);
            baseResponse.setData(userList);
        }catch (Exception e){
            e.printStackTrace();
            baseResponse = new BaseResponse(StatusCode.Fail);
        }
        return baseResponse;
    }
}
