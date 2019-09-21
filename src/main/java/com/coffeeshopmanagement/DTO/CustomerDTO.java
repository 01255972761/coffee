package com.coffeeshopmanagement.DTO;

import javax.persistence.Column;

public class CustomerDTO {
	private int id;
	private String name;
	private boolean gender;
	private String phone;
	private String email;
	private String address;
	private int idUserAccount;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public int getIdUserAccount() {
		return idUserAccount;
	}

	public void setIdUserAccount(int idUserAccount) {
		this.idUserAccount = idUserAccount;
	}

	public CustomerDTO(int id, String name, boolean gender, String phone, String email, String address,
			int idUserAccount) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.idUserAccount = idUserAccount;
	}

	public CustomerDTO() {

	}

}
