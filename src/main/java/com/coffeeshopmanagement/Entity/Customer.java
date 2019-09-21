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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "gender", nullable = false)
	private boolean gender;

	@Column(name = "phone", nullable = false, length = 20)
	private String phone;

	@Column(name = "email", nullable = false, length = 50)
	private String email;

	@Column(name = "address", nullable = false, length = 50)
	private String address;

	@Column(name = "account_id", nullable=true)
	private int idAccount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", referencedColumnName = "id", insertable = false, updatable = false)
	private User userAccount;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Bill> listBill = new ArrayList<Bill>();

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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Bill> getListBill() {
		return listBill;
	}

	public void setListBill(List<Bill> listBill) {
		this.listBill = listBill;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public User getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(User userAccount) {
		this.userAccount = userAccount;
	}

	public Customer(int id, String name, boolean gender, String phone, String email, String address, int idAccount) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.idAccount = idAccount;
	}

	public Customer() {

	}
}
