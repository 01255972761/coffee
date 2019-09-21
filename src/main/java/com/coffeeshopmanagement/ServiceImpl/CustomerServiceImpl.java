package com.coffeeshopmanagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshopmanagement.Entity.Customer;
import com.coffeeshopmanagement.Repository.CustomerRepository;
import com.coffeeshopmanagement.Service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> lsCustomer = new ArrayList<Customer>();
		lsCustomer = customerRepo.findAll();
		return lsCustomer;
	}

	@Override
	public Customer findById(int id) {
		Customer customer = new Customer();
		customer= customerRepo.findById(id).get();
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);
		
	}

	@Override
	public Customer addNewCustomer(Customer customer) {
		Customer entity = new Customer();
		entity = customerRepo.saveAndFlush(customer);
		return entity;
	}

	@Override
	public Customer editCustomer(Customer customer) {
		Customer entity = new Customer();
		entity = customerRepo.findById(customer.getId()).get();
		entity.setId(entity.getId());
		entity.setName(entity.getName());
		entity.setAddress(entity.getAddress());
		entity.setEmail(entity.getEmail());
		entity.setGender(entity.isGender());
		entity.setPhone(entity.getPhone());
		entity.setIdAccount(entity.getIdAccount());
		return customerRepo.saveAndFlush(entity);
	}

}
