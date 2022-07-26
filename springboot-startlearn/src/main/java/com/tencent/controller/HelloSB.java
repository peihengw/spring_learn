package com.tencent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Project:spring_learn
 * @ClassName:HelloSB
 * @Author:v_peihengwu
 * @Date:2022/7/26
 * @Description:TODO
 */
@Controller
public class HelloSB {

    @RequestMapping("/hello")
    @ResponseBody// @ResponseBody标识不需要视图，直接将返回值给到浏览器
    public String helloSB(){
        return "hellosb";
    }
}
