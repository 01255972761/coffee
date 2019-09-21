package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.BillDetailDTO;
import com.coffeeshopmanagement.Entity.BillDetail;

@Component
public class BillDetailConverter {
	public BillDetailDTO convertToDTO(BillDetail billDetail) {
		BillDetailDTO billDetailDTO = new BillDetailDTO();
		billDetailDTO.setId(billDetail.getId());
		billDetailDTO.setQuantity(billDetail.getQuantity());
		billDetailDTO.setIdBill(billDetail.getIdBill());
		billDetailDTO.setIdDrink(billDetail.getIdDrink());
		return billDetailDTO;
	}

	public BillDetail convertToEntity(BillDetailDTO billDetailDTO) {
		BillDetail billDetail = new BillDetail();
		billDetail.setId(billDetailDTO.getId());
		billDetail.setQuantity(billDetailDTO.getQuantity());
		billDetail.setIdBill(billDetailDTO.getIdBill());
		billDetail.setIdDrink(billDetailDTO.getIdDrink());
		return billDetail;
	}

	public List<BillDetailDTO> convertToDTO(List<BillDetail> lsBillDetail) {
		List<BillDetailDTO> lsDTO = new ArrayList<BillDetailDTO>();
		for (BillDetail entity : lsBillDetail) {
			BillDetailDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<BillDetail> convertToEntity(List<BillDetailDTO> lsBillDetailDTO) {
		List<BillDetail> lsEntity = new ArrayList<BillDetail>();
		for (BillDetailDTO dto : lsBillDetailDTO) {
			BillDetail entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
