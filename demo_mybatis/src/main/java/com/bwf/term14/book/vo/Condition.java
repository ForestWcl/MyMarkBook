package com.bwf.term14.book.vo;

public class Condition {

	public Condition() {
	}
	public Condition(Integer firstResult, Integer pageSize) {
		this.firstResult = firstResult;
		this.pageSize = pageSize;
	}
	private Integer firstResult;
	private Integer pageSize;
	public Integer getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
