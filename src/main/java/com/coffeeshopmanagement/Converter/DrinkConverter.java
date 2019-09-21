package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.DrinkDTO;
import com.coffeeshopmanagement.Entity.Drink;

@Component
public class DrinkConverter {
	public DrinkDTO convertToDTO(Drink drink) {
		DrinkDTO drinkDTO = new DrinkDTO();
		drinkDTO.setId(drink.getId());
		drinkDTO.setName(drink.getName());
		drinkDTO.setImage(drink.getImage());
		drinkDTO.setIdMenu(drink.getIdMenu());
		drinkDTO.setUnitPrice(drink.getUnitPrice());
		return drinkDTO;
	}

	public Drink convertToEntity(DrinkDTO drinkDTO) {
		Drink drink = new Drink();
		drink.setId(drinkDTO.getId());
		drink.setName(drinkDTO.getName());
		drink.setImage(drinkDTO.getImage());
		drink.setIdMenu(drinkDTO.getIdMenu());
		drink.setUnitPrice(drinkDTO.getUnitPrice());
		return drink;
	}

	public List<DrinkDTO> convertToDTO(List<Drink> lsDrink) {
		List<DrinkDTO> lsDTO = new ArrayList<DrinkDTO>();
		for (Drink entity : lsDrink) {
			DrinkDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<Drink> convertToEntity(List<DrinkDTO> lsDrinkDTO) {
		List<Drink> lsEntity = new ArrayList<Drink>();
		for (DrinkDTO dto : lsDrinkDTO) {
			Drink entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
