package com.Grocery.Grocery.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pulses")
public class Pulses implements Serializable{

	@Id
	private int pid;
	private String name;
	private int price;
	private String quantity;
	public Pulses(int pid, String name, int price, String quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false)
	@JoinColumn(name="cid",nullable = false)
	private Category category;
	
	
	
	@JsonIgnore
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Pulses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Pulses [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
