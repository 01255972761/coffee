package com.coffeeshopmanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "drink")
public class Drink {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "image", length = 50)
	private String image;

	@Column(name = "unit_price", nullable = false)
	private int unitPrice;

	@Column(name = "menu_id", nullable = false)
	private int idMenu;

	@ManyToOne(optional = false)
	@JoinColumn(name = "menu_id", nullable=false, insertable = false, updatable = false)
	private Menu menuObject;

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

	public Menu getMenu() {
		return menuObject;
	}

	public void setMenu(Menu menu) {
		this.menuObject = menu;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Drink(int id, String name, String image, int unitPrice, int idMenu) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.unitPrice = unitPrice;
		this.idMenu = idMenu;
	}
	
	public Drink() {
	}

}
