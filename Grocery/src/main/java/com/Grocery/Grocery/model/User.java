package com.Grocery.Grocery.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data

@Transactional
@Entity
@Table(name="users")
public class User {

	

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phoneno")
	private int phone_no;
	@Column(name="address")
	private String address;
	private String pwd;
	
	
//	private Orders orders;
//	private Cart cart;
	//private CreditCard cerditcard;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<CreditCard> creditcard=new HashSet<>();
	
	//@OneToMany(mappedBy = "user",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@OneToMany(mappedBy = "user",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Orders> orders;
	
	@OneToMany(mappedBy = "user",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Cart> cart;

	
	public User() {
		
		}
	
//	public int getId1() {
//		return id;
//	}
//
//	public void setUid(int id) {
//		this.id = id;
//	}

//	@OneToOne
//	@JoinColumn(name="uid")
//	@Access(AccessType.PROPERTY)
//	@JsonIgnore
//	public Orders getOrders() {
//		return orders;
//	}
//
//	public void setOrders(Orders orders) {
//		this.orders = orders;
//	}
//
//	@OneToOne
//	@JoinColumn(name="uid")
//	@Access(AccessType.PROPERTY)
//	@JsonIgnore
//	public Cart getCart() {
//		return cart;
//	}
//	public void setCart(Cart cart) {
//		this.cart=cart;
//	}
	
	
//	
//	@OneToOne
//	@JoinColumn(name="uid")
//	@Access(AccessType.PROPERTY)
	//@JsonIgnore
//	public CreditCard getCerditcard() {
//		return cerditcard;
//	}
//
//	public void setCerditcard(CreditCard cerditcard) {
//		this.cerditcard = cerditcard;
//	}
	
	public User(String name, String email, int phone_no, String address, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.address = address;
		this.pwd=pwd;
	}
	public Set<CreditCard> getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(Set<CreditCard> creditcard) {
		this.creditcard = creditcard;
	}
	
	

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
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
	public String getEmail() {
		return email;
	}
	public void setEmail_id(String email) {
		this.email = email;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

	@Override
	public String toString() {
		return "User [uid=" + id + ", name=" + name + ", email=" + email + ", phone_no=" + phone_no
				+ ", address=" + address + ", pwd=" + pwd + "]";
	}

//	public User( String name, String email_id, int phone_no, String address) {
//		super();
//		//this.uid = uid;
//		this.name = name;
//		this.email_id = email_id;
//		this.phone_no = phone_no;
//		this.address = address;
//		//this.orders = orders;
//	}

	
	
}
