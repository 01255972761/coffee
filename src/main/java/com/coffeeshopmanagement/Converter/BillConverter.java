package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.BillDTO;
import com.coffeeshopmanagement.Entity.Bill;

@Component
public class BillConverter {
	public BillDTO convertToDTO(Bill bill) {
		BillDTO billDTO = new BillDTO();
		billDTO.setId(bill.getId());
		billDTO.setDay(bill.getDay());
		billDTO.setIdCustomer(bill.getIdCustomer());
		billDTO.setTotalAmount(bill.getTotalAmount());
		return billDTO;
	}

	public Bill convertToEntity(BillDTO billDTO) {
		Bill bill = new Bill();
		bill.setId(billDTO.getId());
		bill.setDay(billDTO.getDay());
		bill.setIdCustomer(billDTO.getIdCustomer());
		bill.setTotalAmount(bill.getTotalAmount());
		return bill;
	}

	public List<BillDTO> convertToDTO(List<Bill> lsBill) {
		List<BillDTO> lsDTO = new ArrayList<BillDTO>();
		for (Bill entity : lsBill) {
			BillDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<Bill> convertToEntity(List<BillDTO> lsBillDTO) {
		List<Bill> lsEntity = new ArrayList<Bill>();
		for (BillDTO dto : lsBillDTO) {
			Bill entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
