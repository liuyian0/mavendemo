package com.liu.day01.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
//获取请求参数的通用方法1（麻烦，理解就行）
@WebServlet("/demo06")
public class Demo06Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求方式
        String method = request.getMethod();
        //2.获取请求参数
        String params = "";
        //请求方式为GET
        if ("GET".equals(method)){
            params = request.getQueryString();
        }else if ("POST".equals(method)){
            BufferedReader reader = request.getReader();
            params = reader.readLine();
        }
        //3.将请求参数输出到打印控制台
        System.out.println(params);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

}

