package com.liu.day01.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response01")
public class ResponseDemo01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("response1");
        /*//重定向
        //1.设置响应状态码302
        response.setStatus(302);
        //2.设置响应头location
        response.setHeader("location","/response02");*/
        //可以直接简写为
        response.sendRedirect("/response02");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}

