package com.wuchanglin.hibernate.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name="uname")   //如果数据库表里字段名字和实体类属性不一致，需要配置 column 注解 ！
	private String name;
	
	private String loginId;
	private String loginPsw;
	private String sex;
	private Date birthdate;
	private int age;
	private Adress adress;
	@Transient
	private Set<Car> carList;
	
	
	public User() {
	}
	
	
	public User(String name, String loginId, String loginPsw, String sex, Date birthdate, int age) {
		this.name = name;
		this.loginId = loginId;
		this.loginPsw = loginPsw;
		this.sex = sex;
		this.birthdate = birthdate;
		this.age = age;
	}

	

	public User(String name, String loginId, String loginPsw, String sex, Date birthdate, int age, Adress adress) {
		this.name = name;
		this.loginId = loginId;
		this.loginPsw = loginPsw;
		this.sex = sex;
		this.birthdate = birthdate;
		this.age = age;
		this.adress = adress;
	}


	public User(Integer id, String name, String loginId, String loginPsw, String sex, Date birthdate, int age) {
		this.id = id;
		this.name = name;
		this.loginId = loginId;
		this.loginPsw = loginPsw;
		this.sex = sex;
		this.birthdate = birthdate;
		this.age = age;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Car> getCarList() {
		return carList;
	}
	public void setCarList(Set<Car> carList) {
		this.carList = carList;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", loginId=" + loginId + ", loginPsw=" + loginPsw + ", sex=" + sex
				+ ", birthdate=" + birthdate + ", age=" + age + ", carList=" + carList + ", adress=" + adress + "]";
	}
	
	
}
