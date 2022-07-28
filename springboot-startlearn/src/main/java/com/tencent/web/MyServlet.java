package com.tencent.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Project:spring_learn
 * @ClassName:MyServlet
 * @Author:v_peihengwu
 * @Date:2022/7/27
 * @Description:TODO
 */

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //使用HttpServletResponse输出数据
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.flush();
        out.close();
    }
}
