package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.CustomerDTO;
import com.coffeeshopmanagement.Entity.Customer;

@Component
public class CustomerConverter {
	public CustomerDTO convertToDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setName(customer.getName());
		customerDTO.setAddress(customer.getAddress());
		customerDTO.setEmail(customer.getEmail());
		customerDTO.setGender(customer.isGender());
		customerDTO.setPhone(customer.getPhone());
		if(customer.getIdAccount()==0) {
			customerDTO.setIdUserAccount(0);
		} else {
			customerDTO.setIdUserAccount(customer.getIdAccount());
		}
		return customerDTO;
	}

	public Customer convertToEntity(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setId(customerDTO.getId());
		customer.setName(customerDTO.getName());
		customer.setAddress(customerDTO.getAddress());
		customer.setEmail(customerDTO.getEmail());
		customer.setGender(customerDTO.isGender());
		customer.setPhone(customerDTO.getPhone());
		if(customerDTO.getIdUserAccount()==0) {
			customer.setIdAccount((Integer) null);
		} else {
			customer.setIdAccount(customerDTO.getIdUserAccount());
		}
		
		return customer;
	}

	public List<CustomerDTO> convertToDTO(List<Customer> lsCustomer) {
		List<CustomerDTO> lsDTO = new ArrayList<CustomerDTO>();
		for (Customer entity : lsCustomer) {
			CustomerDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<Customer> convertToEntity(List<CustomerDTO> lsCustomerDTO) {
		List<Customer> lsEntity = new ArrayList<Customer>();
		for (CustomerDTO dto : lsCustomerDTO) {
			Customer entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
