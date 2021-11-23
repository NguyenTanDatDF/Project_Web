package com.nhom1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditProductController extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 String id = req.getParameter("id");
	  String name = req.getParameter("name");
	  String brand_code = req.getParameter("brand_code");
	  String category_code = req.getParameter("category_code");
	  String picture_url = req.getParameter("picture_url");
	  String price = req.getParameter("price");
	  String quatity = req.getParameter("quatity");
	  String description = req.getParameter("description");
	  req.setAttribute("id", id);
	   req.setAttribute("description", description);
	   req.setAttribute("quatity", quatity);
	   req.setAttribute("name", name);
	   req.setAttribute("brand_code", brand_code);
	   req.setAttribute("category_code", category_code);
	   req.setAttribute("picture_url", picture_url);
	   req.setAttribute("price", price);
	   req.getRequestDispatcher("/Pages/Catalog/ProductEdit/index.jsp").forward(req, resp);
}
}
