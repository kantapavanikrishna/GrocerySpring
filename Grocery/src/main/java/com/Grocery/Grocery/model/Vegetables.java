package com.Grocery.Grocery.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="vegetables")
public class Vegetables implements Serializable{

	@Id
	private int vid;
	private String name;
	private String type;
	private String quantity;
	private int price;
	
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
	public Vegetables(int vid, String name, String type, String quantity, int price) {
		super();
		this.vid = vid;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vegetables [vid=" + vid + ", name=" + name + ", type=" + type + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	public Vegetables() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
