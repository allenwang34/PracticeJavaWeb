package com.allen.cart.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * 课程（商品）控制器
 *
 */

@WebServlet(name = "ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setAttribute("products",null);
        req.getRequestDispatcher("/WEB-INF/views/biz/list.jsp");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
