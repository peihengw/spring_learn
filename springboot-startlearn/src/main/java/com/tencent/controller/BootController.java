package com.tencent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Project:spring_learn
 * @ClassName:BootController
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */

@Controller
public class BootController {


    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "访问/user/account地址";
    }

    @ResponseBody
    @RequestMapping("/user/login")
    public String userLogin(){
        return "访问/user/login地址";
    }
}
