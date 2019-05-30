package com.crk.dubbo.authAccess.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chengrongkai
 * @description: TODO
 * @date 2019/5/3022:33
 */
@Data
public class UserQueryDto implements Serializable {
    private int userId;

    private String userName;

    private int phone;
}
