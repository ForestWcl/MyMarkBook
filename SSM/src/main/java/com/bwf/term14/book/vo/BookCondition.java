package com.bwf.term14.book.vo;

public class BookCondition extends Condition {
	
	private String title;
	private String categoryName;
	public BookCondition() {
	}
	public BookCondition(String title, String categoryName, Integer pageCurr, Integer pageSize) {
		super(pageCurr, pageSize);
		this.title = title;
		this.categoryName = categoryName;
	}
	public BookCondition(Integer pageCurr, Integer pageSize) {
		this(null, null, pageCurr, pageSize);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
