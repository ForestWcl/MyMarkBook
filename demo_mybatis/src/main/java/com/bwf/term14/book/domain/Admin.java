package com.bwf.term14.book.domain;

public class Admin {
	private Integer id;
	private String loginId;
	private String loginPsw;
	private String name;
	
	public Admin() {
	}
	public Admin(Integer id, String loginId, String loginPsw, String name) {
		this.id = id;
		this.loginId = loginId;
		this.loginPsw = loginPsw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", loginId=" + loginId + ", loginPsw=" + loginPsw + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPsw() {
		return loginPsw;
	}
	public void setLoginPsw(String loginPsw) {
		this.loginPsw = loginPsw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
