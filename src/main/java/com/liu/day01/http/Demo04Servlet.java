package com.liu.day01.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
//获取请求体数据
@WebServlet("/demo04")
public class Demo04Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取post请求体：请求参数
        //1.获取字符输入流
        BufferedReader reader = request.getReader();
        //2.读取数据
        String s = reader.readLine();
        System.out.println("s = " + s);
    }
}

