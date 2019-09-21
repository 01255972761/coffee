package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.Bill;

public interface BillService {
	public List<Bill> findAllDrinks();

	public Bill findById(int id);
	
	public List<Bill> findByMonth(int month, int year);
	
	public List<Bill> findByYear(int year);
	
	public List<Bill> findByDay(int day);
	
	public List<Bill> findByCustomer(int id);

	public void deleteById(int id);

	public Bill addNewBill(Bill bill);

}
