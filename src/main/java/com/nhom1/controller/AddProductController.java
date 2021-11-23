package com.nhom1.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nhom1.model.*;
import com.nhom1.data.*;

/**
 * Servlet implementation class HomeController
 */

public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
        productDao = new ProductDAO();
        
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
                try {
					insertProduct(request, response);
				} catch (SQLException e) {				
					e.printStackTrace();
				} catch (IOException e) {	
					e.printStackTrace();
				}
        
	}
    private void insertProduct(HttpServletRequest request, HttpServletResponse response)
    	    throws SQLException, IOException {
    	 int seller_id = 0;
         String category = request.getParameter("category");
         String brand = request.getParameter("brand");
         String title = "Shoe for you";
         String productdescription = request.getParameter("productdescription");
         int size = 40;
         int rating = 6;
         String instock = "In Stock";
         int quantity = Integer.parseInt(request.getParameter("quantity"));
         float price = Float.parseFloat(request.getParameter("price"));
         String picture = request.getParameter("data_url");
         String productname = request.getParameter("productname");
        request.setAttribute("size", size);
        request.setAttribute("quantity", quantity);
        request.setAttribute("price", price);
        request.setAttribute("seller_id", seller_id);
        request.setAttribute("category", category);
        request.setAttribute("brand", brand);
        request.setAttribute("title", title);
        request.setAttribute("productdescription", productdescription);
        request.setAttribute("rating", rating);
        request.setAttribute("instock", instock);
        request.setAttribute("picture", picture);
        request.setAttribute("productname", productname);
    	       // Product newProduct = new Product(3,"3","3","3","3",3,3,3,3,"3","3eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee","3");
    	        Product newProduct = new Product(seller_id,category,brand,title,productdescription,size,quantity,price,rating,instock,picture,productname);
    	        productDao.saveProduct(newProduct);
    	      
    	        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");      
					try {
						dispatcher.forward(request, response);
					} catch (ServletException e) {				
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
    	    }

}
