package com.cg.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empmvn_hib1")
public class Emp {
	@Id
	private int id;
	private String name;
	private String desig;
	public Emp(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	

}
