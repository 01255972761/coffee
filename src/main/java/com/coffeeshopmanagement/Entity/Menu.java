package com.coffeeshopmanagement.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menuObject", cascade = CascadeType.ALL)
	private List<Drink> listDrinks = new ArrayList<Drink>();
	
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
	public List<Drink> getListDrinks() {
		return listDrinks;
	}
	public void setListDrinks(List<Drink> listDrinks) {
		this.listDrinks = listDrinks;
	}
	
	
}
