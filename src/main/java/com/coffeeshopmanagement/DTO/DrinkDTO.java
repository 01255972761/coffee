package com.coffeeshopmanagement.DTO;

import javax.persistence.Column;

public class DrinkDTO {
	private int id;
	private String name;
	private String image;
	private int unitPrice;
	private int idMenu;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public DrinkDTO(int id, String name, String image, int idMenu, int unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.idMenu = idMenu;
		this.unitPrice = unitPrice;
	}

	public DrinkDTO() {

	}

}
