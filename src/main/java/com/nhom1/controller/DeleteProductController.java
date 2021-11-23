package com.nhom1.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhom1.data.ProductDAO;
import com.nhom1.model.Product;

public class DeleteProductController extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt(req.getParameter("id"));
	 
	   ProductDAO productDAO = new ProductDAO();
	
	 
	   productDAO.deleteProduct(id);
	   
	   req.getRequestDispatcher("index.jsp").forward(req, resp);
}
}
