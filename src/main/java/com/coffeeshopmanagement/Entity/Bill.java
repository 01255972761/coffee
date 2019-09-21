package com.coffeeshopmanagement.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Table;

@Entity
@Table(name = "Bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "day", nullable = false)
	private Date day;
	
	@Column(name = "total_amount", nullable = false)
	private int totalAmount;
	
	@Column(name = "customer_id")
	private int idCustomer;

	@ManyToOne(optional=false)
	@JoinColumn(name = "customer_id", insertable=false, updatable=false)
	private Customer customer;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bill", cascade = CascadeType.ALL)
	private List<BillDetail> listBillDetails = new ArrayList<BillDetail>();

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<BillDetail> getListBillDetails() {
		return listBillDetails;
	}

	public void setListBillDetails(List<BillDetail> listBillDetails) {
		this.listBillDetails = listBillDetails;
	}

	public Bill(int id, Date day, int totalAmount, int idCustomer) {
		super();
		this.id = id;
		this.day = day;
		this.totalAmount = totalAmount;
		this.idCustomer = idCustomer;
	}
	
	public Bill() {

	}
}
