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
import javax.transaction.Transactional;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="orders")
@Transactional
public class Orders{
	
	
	@Id
	private int oid;
	private String pname;
	private int price;
	private String quantity;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="uid",nullable=false)
	private User user;
	
	
	public Orders(int oid, String pname, int price, String quantity) {
		super();
		this.oid = oid;
		//this.uid = uid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
//	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
	
	
	
//	@Override
//	public String toString() {
//		return "Orders [oid=" + oid + ",  pname=" + pname + ", price=" + price + ", quantity="
//				+ quantity + "]";
//	}
	
	

}
