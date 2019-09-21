package com.coffeeshopmanagement.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeshopmanagement.Converter.BillConverter;
import com.coffeeshopmanagement.DTO.BillDTO;
import com.coffeeshopmanagement.Entity.Bill;
import com.coffeeshopmanagement.Service.BillService;

@RestController
@RequestMapping("/api")
public class BillRestController {
	@Autowired
	private BillService billService;
	
	@Autowired
	private BillConverter billConverter;
	
	@GetMapping("/bill/find-all")
	public List<BillDTO> findAllBill(){
		List<Bill> lsBill =  new ArrayList<Bill>();
		lsBill = billService.findAllDrinks();
		return billConverter.convertToDTO(lsBill);
	}
	
	@GetMapping("/bill/find-by-id/{id}")
	public BillDTO findById(@PathVariable int id) {
		return billConverter.convertToDTO(billService.findById(id));
	}
	
	@GetMapping("/bill/find-by-customer/{id}")
	public List<BillDTO> findByCustomer(@PathVariable int id) {
		return billConverter.convertToDTO(billService.findByCustomer(id));
	}
	
	@PostMapping("/bill/add-bill")
	public BillDTO addNewBill(@RequestBody BillDTO billkDTO) {
		Bill bill = billConverter.convertToEntity(billkDTO);
		BillDTO dto = billConverter.convertToDTO(billService.addNewBill(bill));
		return dto;
	}
	
	@DeleteMapping("/bill/delete-bill/{id}")
	public void deleteBill(@PathVariable int id) {
		billService.deleteById(id);
	}
}
