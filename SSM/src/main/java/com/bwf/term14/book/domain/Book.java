package com.bwf.term14.book.domain;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String title;
	
	private String author;
	private Double price;
	
	private String publisher;	
	private String photo;
	private Category belongCategory;
	
	
	
	
	public Book() {
	}
	public Book(Integer id, String title, String author, Double price, String publisher, String photo,
			Category belongCategory) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.photo = photo;
		this.belongCategory = belongCategory;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", publisher="
				+ publisher + ", photo=" + photo + ", belongCategory=" + belongCategory + "]";
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Category getBelongCategory() {
		return belongCategory;
	}
	public void setBelongCategory(Category belongCategory) {
		this.belongCategory = belongCategory;
	}

}
