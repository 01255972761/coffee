package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.Customer;

public interface CustomerService {
	public List<Customer> findAllCustomers();
	
	public Customer findById(int id);
	
	public void deleteCustomer(int id);
	
	public Customer addNewCustomer(Customer customer);
	
	public Customer editCustomer(Customer customer);
}
