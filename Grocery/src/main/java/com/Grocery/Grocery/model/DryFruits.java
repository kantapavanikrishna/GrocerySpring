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
@Table(name="dry_fruits")
public class DryFruits implements Serializable{

	@Id
	private int did;
	private String name;
	private int price;
	private String quantity;
	public DryFruits(int did, String name, int price, String quantity) {
		super();
		this.did = did;
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
	
	public DryFruits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
		return "DryFruits [did=" + did + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
