package com.Grocery.Grocery.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Transactional
@Entity
@Table(name="credit_card")
public class CreditCard implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
	private int credit_id;
	private String cardno;
	private String cvv;
	private String creditname;
//	@Column(name="uid",nullable=false)
//	private int uid;
	
	
//	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="uid",nullable = false)
	private User user;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard( int credit_id,String cardno, String cvv, String creditname,User user) {
		super();
		this.credit_id = credit_id;
		this.cardno = cardno;
		this.cvv = cvv;
		this.creditname = creditname;
		this.user=user;
		
	}
	public int getCredit_id() {
		return credit_id;
	}
	public void setCredit_id(int credit_id) {
		this.credit_id = credit_id;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getCreditname() {
		return creditname;
	}
	public void setCreditname(String creditname) {
		this.creditname = creditname;
	}
	
	
	

	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "CreditCard [credit_id=" + credit_id + ", cardno=" + cardno + ", cvv=" + cvv + ", creditname="
				+ creditname + "]";
	}
	
	

}
