package com.bwf.term14.book.vo;

public class Condition {

	public Condition() {
	}
	public Condition(Integer pageCurr, Integer pageSize) {
		this.pageCurr = pageCurr;
		this.pageSize = pageSize;
	}
	private Integer pageCurr;
	private Integer pageSize;
	
	public Integer getPageCurr() {
		return pageCurr;
	}
	public void setPageCurr(Integer pageCurr) {
		this.pageCurr = pageCurr;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
