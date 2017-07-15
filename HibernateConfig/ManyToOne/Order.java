package com.wuchanglin.hibernate.entity.manytoone;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_order")
public class Order {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oid;
	private String ocustomer;
	private Double omoney;
	private Date oposttime;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOcustomer() {
		return ocustomer;
	}
	public void setOcustomer(String ocustomer) {
		this.ocustomer = ocustomer;
	}
	public Double getOmoney() {
		return omoney;
	}
	public void setOmoney(Double omoney) {
		this.omoney = omoney;
	}
	public Date getOposttime() {
		return oposttime;
	}
	public void setOposttime(Date oposttime) {
		this.oposttime = oposttime;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", ocustomer=" + ocustomer + ", omoney=" + omoney + ", oposttime=" + oposttime
				+ "]";
	}
	
	
}
