package com.allen.cart.servlet;

import com.allen.cart.data.LocalCache;
import com.allen.cart.data.Product;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


public class CartServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (Objects.equals("/cart/cart.do",req.getServletPath())) {
            String productID = req.getParameter("productI");
            System.out.print(productID);
            if (productID != null) {
                Product addedProduct = LocalCache.getProduct(Long.valueOf(productID));
                LocalCache.addCart(addedProduct);
            }
            resp.sendRedirect("/cart/list.do");
            //req.getRequestDispatcher("/cart/list.do").forward(req,resp);
        } else if (Objects.equals("/cart/list.do",req.getServletPath())) {
                req.setAttribute("carts",LocalCache.getCarts());
                req.getRequestDispatcher("/WEB-INF/view/biz/chart.jsp").forward(req,resp);
        }
    }
}
