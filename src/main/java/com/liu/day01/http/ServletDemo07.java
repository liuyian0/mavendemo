package com.liu.day01.http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

//🔺request方法获取请求参数
@WebServlet("/demo07")
public class ServletDemo07 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //GET请求
        //1.获取所有参数的map集合
        Map<String,String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            //System.out.println("key = " + key);
            //获取值
            String[] values = map.get(key);
            for (String value : values) {
                System.out.println(key+":"+value);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

