package com.liu.day01.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//获取请求行数据
@WebServlet("/demo02")
public class Demo02Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String getMethod()获取请求方式
        String method = request.getMethod();
        System.out.println("method = " + method);//GET
        //String getContextPath()获取虚拟路径
        String contextPath = request.getContextPath();
        System.out.println("contextPath = " + contextPath);//空白，未设置
        //StringBuffer getRequestURL() 获取URL
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("requestURL = " + requestURL);//http://localhost:8080/demo02
        //String getRequestURI() 获取URI
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);// /demo02
        //String getQueryString() 获取请求参数
        String queryString = request.getQueryString();
        System.out.println("queryString = " + queryString);//username=zhangsan
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

