package com.crk.dubbo.authAccess.server.service.dubbo;
import com.alibaba.dubbo.config.annotation.Service;
import com.crk.dubbo.api.service.HelloworldService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


/**
 * @Author: 程荣凯
 * @Date: 2019/5/28 9:31
 * @Description:
 */
@Service(protocol = {"dubbo","rest"},validation = "true",version = "1.0",timeout = 3000)
@Path("helloworld")
public class HelloworldServiceImpl implements HelloworldService{
    /**
     * 简单的helloworld
     *
     * @param name
     * @return
     */
    @Path("sayHello")
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
