package com.wuchanglin.springmvc.entity;

public class Book {

	private Integer id;
	private String title;
	private String author;
	private Double price;
	private String pulisher;
	
	public Book() {
	}
	
	public Book(Integer id, String title, String author, Double price, String pulisher) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pulisher = pulisher;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPulisher() {
		return pulisher;
	}
	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}
	
	
	
}
