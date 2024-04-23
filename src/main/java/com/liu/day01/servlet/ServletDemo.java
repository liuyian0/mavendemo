package com.liu.day01.servlet;

import javax.servlet.*;
import java.io.IOException;
//1.创建web项目
//2.导入Servlet依赖
//3.在创建的web项目中自定义类实现Servlet接口
//4.在自定义类中实现Servlet接口中所有的抽象方法
//5.在实现Servlet接口的service方法中书写代码处理业务逻辑
//6.在web项目的核心配置文件web.xml中配置访问servlet的路径
//7.启动Tomcat
//8.在浏览器中访问servlet类

    //3.在创建的web项目中自定义类实现Servlet接口
public class ServletDemo implements Servlet {
    //4.在自定义类中实现Servlet接口中所有的抽象方法
    //5.在实现Servlet接口的service方法中书写代码处理业务逻辑
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...初始化方法，服务器一启动就执行该方法，就执行一次");
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...每次访问都会执行一次");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destory...销毁servlet对象时执行一次");

    }
}
