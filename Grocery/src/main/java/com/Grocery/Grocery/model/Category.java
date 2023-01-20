package com.Grocery.Grocery.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category implements Serializable{
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "category",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Vegetables> vegetables;
	
	@OneToMany(mappedBy = "category",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Fruits> fruits;
	
	@OneToMany(mappedBy = "category",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<DryFruits> dryfruits;
	
	@OneToMany(mappedBy = "category",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Pulses> pulses;
	
	
	public Set<Vegetables> getVegetables() {
		return vegetables;
	}
	public void setVegetables(Set<Vegetables> vegetables) {
		this.vegetables = vegetables;
	}
	public Set<Fruits> getFruits() {
		return fruits;
	}
	public void setFruits(Set<Fruits> fruits) {
		this.fruits = fruits;
	}
	public Set<DryFruits> getDryfruits() {
		return dryfruits;
	}
	public void setDryfruits(Set<DryFruits> dryfruits) {
		this.dryfruits = dryfruits;
	}
	public Set<Pulses> getPulses() {
		return pulses;
	}
	public void setPulses(Set<Pulses> pulses) {
		this.pulses = pulses;
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	

}
