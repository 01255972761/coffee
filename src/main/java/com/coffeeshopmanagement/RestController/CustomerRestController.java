package com.coffeeshopmanagement.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeshopmanagement.Converter.CustomerConverter;
import com.coffeeshopmanagement.DTO.CustomerDTO;
import com.coffeeshopmanagement.Entity.Customer;
import com.coffeeshopmanagement.Repository.CustomerRepository;
import com.coffeeshopmanagement.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerConverter customerConverter;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer/find-all")
	public List<CustomerDTO> findAllCustomer(){
		return customerConverter.convertToDTO(customerService.findAllCustomers());
	}
	
	@GetMapping("/customer/find-by-id/{id}")
	public CustomerDTO findById(@PathVariable int id) {
		return customerConverter.convertToDTO(customerService.findById(id));
	}
	
	@PostMapping("/customer/add-customer")
	public CustomerDTO addNewCustomer(@RequestBody CustomerDTO customerdto) {
		Customer customer = customerConverter.convertToEntity(customerdto);
		CustomerDTO dto = customerConverter.convertToDTO(customerService.addNewCustomer(customer));
		return dto;
	}
	
	@DeleteMapping("/customer/delete-customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
	
	@PutMapping("/customer/edit-customer")
	public CustomerDTO editCustomer(@RequestBody CustomerDTO customerdto) {
		Customer customer = customerConverter.convertToEntity(customerdto);
		CustomerDTO dto = customerConverter.convertToDTO(customerService.editCustomer(customer));
		return dto;
	}
}
