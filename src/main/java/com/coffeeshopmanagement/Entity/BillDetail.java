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
@Table(name = "billdetail")
public class BillDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "drink_id", nullable = false)
	private int idDrink;

	@Column(name = "bill_id", nullable = false)
	private int idBill;

	@ManyToOne(optional = false)
	@JoinColumn(name = "bill_id", insertable = false, updatable = false)
	private Bill bill;

	@ManyToOne(optional = false)
	@JoinColumn(name = "drink_id", insertable = false, updatable = false)
	private Drink drink;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIdDrink() {
		return idDrink;
	}

	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}

	public int getIdBill() {
		return idBill;
	}

	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public BillDetail(int id, int quantity, int idDrink, int idBill) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.idDrink = idDrink;
		this.idBill = idBill;
	}

	public BillDetail() {

	}

}
