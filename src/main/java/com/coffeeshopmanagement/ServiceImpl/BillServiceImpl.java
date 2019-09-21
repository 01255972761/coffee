package com.coffeeshopmanagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshopmanagement.Entity.Bill;
import com.coffeeshopmanagement.Entity.Drink;
import com.coffeeshopmanagement.Repository.BillRepository;
import com.coffeeshopmanagement.Service.BillService;
@Service
public class BillServiceImpl implements BillService{

	@Autowired
	private BillRepository billRepo;
	
	@Override
	public List<Bill> findAllDrinks() {
		List<Bill> lsBill = new ArrayList<Bill>();
		lsBill= billRepo.findAll();
		return lsBill;
	}

	@Override
	public Bill findById(int id) {
		Bill bill = billRepo.findById(id).get();
		return bill;
	}

	@Override
	public List<Bill> findByMonth(int month, int year) {
		List<Bill> lsBill = new ArrayList<Bill>();
		return lsBill;
	}

	@Override
	public List<Bill> findByYear(int year) {
		List<Bill> lsBill = new ArrayList<Bill>();
		return lsBill;
	}

	@Override
	public List<Bill> findByDay(int day) {
		List<Bill> lsBill = new ArrayList<Bill>();
		return lsBill;
	}

	@Override
	public List<Bill> findByCustomer(int id) {
		List<Bill> lsBill = new ArrayList<Bill>();
		lsBill = billRepo.findByCustomer(id);
		return null;
	}

	@Override
	public void deleteById(int id) {
		billRepo.deleteById(id);		
	}

	@Override
	public Bill addNewBill(Bill bill) {
		Bill entity = billRepo.saveAndFlush(bill);
		return entity;
	}

}
