package com.coffeeshopmanagement.DTO;

import java.util.Date;

public class BillDTO {
	private int id;
	private Date day;
	private int totalAmount;
	private int idCustomer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public BillDTO(int id, Date day, int totalAmount, int idCustomer) {
		super();
		this.id = id;
		this.day = day;
		this.totalAmount = totalAmount;
		this.idCustomer = idCustomer;
	}

	public BillDTO() {

	}
}
