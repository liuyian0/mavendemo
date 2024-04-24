package com.liu.day01.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*解决post乱码问题
get请求不用书写代码来处理乱码，所以只需要书写代码处理post乱码问题
只解决来自请求体数据的乱码，而get请求没有请求体，所以之解决post乱码问题
用到ServletRequest接口中的void setCharacterEncoding(String env)
 */
@WebServlet("/demo08")
public class Demo08Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取浏览器的请求数据
        String username = request.getParameter("username");
        System.out.println("username = " + username);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

