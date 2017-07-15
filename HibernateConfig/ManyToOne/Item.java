package com.wuchanglin.hibernate.entity.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



@Entity
@Table(name="tbl_item")
public class Item {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iid;
	private String igoods;
	private Integer icount;
	private Double iprice;
	private Double itotal;
	
	@ManyToOne
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name="iorderid")
	private Order belongOrder;

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getIgoods() {
		return igoods;
	}

	public void setIgoods(String igoods) {
		this.igoods = igoods;
	}

	public Integer getIcount() {
		return icount;
	}

	public void setIcount(Integer icount) {
		this.icount = icount;
	}

	public Double getIprice() {
		return iprice;
	}

	public void setIprice(Double iprice) {
		this.iprice = iprice;
	}

	public Double getItotal() {
		return itotal;
	}

	public void setItotal(Double itotal) {
		this.itotal = itotal;
	}

	public Order getOrder() {
		return belongOrder;
	}

	public void setOrder(Order belongOrder) {
		this.belongOrder = belongOrder;
	}

	@Override
	public String toString() {
		return "Item [iid=" + iid + ", igoods=" + igoods + ", icount=" + icount + ", iprice=" + iprice + ", itotal="
				+ itotal + ", belongOrder=" + belongOrder + "]";
	}
	
	
}
