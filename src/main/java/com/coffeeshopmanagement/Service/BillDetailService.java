package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.BillDetail;

public interface BillDetailService {
	public List<BillDetail> findAllDrinks();

	public BillDetail findById(int id);

	public List<BillDetail> findByBillId(int id);

	public BillDetail addNewBillDetail(BillDetail billDetail);

	public List<BillDetail> findByDrink(int id);
}
