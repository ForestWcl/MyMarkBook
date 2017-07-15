package com.wuchanglin.hibernate.entity.manytomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.wuchanglin.hibernate.util.Sex;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="tbl_teacher")
public class Teacher {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tid;
	private String tname;
	
	@Enumerated(EnumType.STRING)
	private Sex tsex;
	private Integer tyear;
	private String ttype;
	
	@ManyToMany(mappedBy="teachers")//由对方维护关联关系的写法
	private Set<Klass> klasses;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getTyear() {
		return tyear;
	}
	public void setTyear(Integer tyear) {
		this.tyear = tyear;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	
	public Sex getTsex() {
		return tsex;
	}
	public void setTsex(Sex tsex) {
		this.tsex = tsex;
	}
	
	
	public Set<Klass> getKlasses() {
		return klasses;
	}
	public void setKlasses(Set<Klass> klasses) {
		this.klasses = klasses;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsex=" + tsex + ", tyear=" + tyear + ", ttype=" + ttype
				+ "]";
	}
	
	
	
}
