package com.nhom1.model;

import java.text.NumberFormat;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private int seller_id;
	private String category_code;
	private String brand_code;
	private String title;
	private String description;
	private int size;
	private int quatity;
	private float price;
	private int rating;
	private String inStock ;
	private String picture_url;
	private String name;
	

	
	public Product() {
	
	}


	public Product(int seller_id, String category_code, String brand_code, String title, String description, int size,
			int quatity, float price, int rating, String inStock, String picture_url, String name) {
		this.seller_id = seller_id;
		this.category_code = category_code;
		this.brand_code = brand_code;
		this.title = title;
		this.description = description;
		this.size = size;
		this.quatity = quatity;
		this.price = price;
		this.rating = rating;
		this.inStock = inStock;
		this.picture_url = picture_url;
		this.name = name;
	}

	public Product(int id,int seller_id, String category_code, String brand_code, String title, String description, int size,
			int quatity, float price, int rating, String inStock, String picture_url, String name) {
		this.id =id;
		this.seller_id = seller_id;
		this.category_code = category_code;
		this.brand_code = brand_code;
		this.title = title;
		this.description = description;
		this.size = size;
		this.quatity = quatity;
		this.price = price;
		this.rating = rating;
		this.inStock = inStock;
		this.picture_url = picture_url;
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getInStock() {
		return inStock;
	}
	public void setInStock(String inStock) {
		this.inStock = inStock;
	}
	public String getPicture_url() {
		return picture_url;
	}
	public void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}
	
}
