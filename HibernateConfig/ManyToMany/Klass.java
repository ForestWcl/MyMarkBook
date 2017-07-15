package com.wuchanglin.hibernate.entity.manytomany;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_klass")
public class Klass {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer kid;
	private String kname;
	private String kprof;
	private Date kopen;
	
	@ManyToMany
	@JoinTable(name="tbl_klass_teacher_relationship",
			joinColumns=@JoinColumn(name="rklassid"),
			inverseJoinColumns=@JoinColumn(name="rteacherid")
			)															//由此类维护关联关系写法
	private Set<Teacher> teachers;
	
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKprof() {
		return kprof;
	}
	public void setKprof(String kprof) {
		this.kprof = kprof;
	}
	public Date getKopen() {
		return kopen;
	}
	public void setKopen(Date kopen) {
		this.kopen = kopen;
	}
	
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Klass [kid=" + kid + ", kname=" + kname + ", kprof=" + kprof + ", kopen=" + kopen + "]";
	}
	
	
}
