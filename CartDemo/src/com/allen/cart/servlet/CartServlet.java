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

@WebServlet(name = "CartServlet")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (Objects.equals("/cart/cart.do",req.getServletPath())) {
            String productID = req.getParameter("productID");
            if (productID != null) {
                Product addedProduct = LocalCache.getProduct(Long.valueOf(productID));
            }
        }
    }
}
