package com.Grocery.Grocery.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cart")

public class Cart implements Serializable{

	@Id
	private int cartid;
	
	private String pname;
	private int price;
	private String quantity;
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

	

	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch=FetchType.LAZY,optional = true)
	@JoinColumn(name="uid",nullable = false)
	private User user;
	
	
	public Cart(int cartid, String pname, int price, String quantity, User user) {
	super();
	this.cartid = cartid;
	this.pname = pname;
	this.price = price;
	this.quantity = quantity;
	this.user = user;
}
	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + ", user="
				+ user + "]";
	}
	
	
	
	

}
