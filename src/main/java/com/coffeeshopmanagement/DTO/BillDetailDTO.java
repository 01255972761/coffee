package com.coffeeshopmanagement.DTO;


public class BillDetailDTO {
	private int id;
	private int quantity;
	private int idDrink;
	private int idBill;
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
	public BillDetailDTO(int id, int quantity, int idDrink, int idBill) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.idDrink = idDrink;
		this.idBill = idBill;
	}
	public BillDetailDTO() {

	}
	
}
