package com.nhom1.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhom1.data.ProductDAO;
import com.nhom1.model.Product;

public class SaveController extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt(req.getParameter("id"));
	  String name = req.getParameter("name");
	  String brand_code = req.getParameter("brand_code");
	  String category_code = req.getParameter("category_code");
	  
	  String picture_url;
	  try {
	   picture_url = req.getParameter("picture_url");
	  }
	  catch (Exception e) 
	  {
		   picture_url = "";
	  }
	  
	   String price;
	  try {
		   price = req.getParameter("price");
		  }
		  catch (Exception e) 
		  {
			   price = "";
		  }
	  
	  int quatity = Integer.parseInt(req.getParameter("quatity"));
	  String description = req.getParameter("description");
	  
	  String oldprice = req.getParameter("old_price");
	  String oldpicture = req.getParameter("old_picture_url");
	  if(price=="")
	  {
		  price = oldprice;
	  }
	  float fprice = Float.parseFloat(price);
	  if(picture_url=="")
	  {
		  picture_url = oldpicture;
	  }
	  
//	   req.setAttribute("oldprice", oldprice);
//	   req.setAttribute("oldpicture", oldpicture);
//	   
//	   req.setAttribute("id", id);
//	   req.setAttribute("description", description);
//	   req.setAttribute("quatity", quatity);
//	   req.setAttribute("name", name);
//	   req.setAttribute("brand_code", brand_code);
//	   req.setAttribute("category_code", category_code);
//	   req.setAttribute("picture_url", picture_url);
//	   req.setAttribute("price", price);
	   ProductDAO productDAO = new ProductDAO();
	   Product product = new Product(id,0,category_code,brand_code,"for you",description,40,quatity,fprice,6,"In Stock",picture_url,name);
	 
	   productDAO.updateProduct(product);
	   
	   req.getRequestDispatcher("index.jsp").forward(req, resp);
}
}
