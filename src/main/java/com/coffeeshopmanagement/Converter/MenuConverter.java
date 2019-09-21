package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.MenuDTO;
import com.coffeeshopmanagement.Entity.Menu;

@Component
public class MenuConverter {
	public MenuDTO convertToDTO(Menu menu) {
		MenuDTO menuDTO = new MenuDTO();
		menuDTO.setId(menu.getId());
		menuDTO.setName(menu.getName());
		return menuDTO;
	}

	public Menu convertToEntity(MenuDTO menuDTO) {
		Menu menu = new Menu();
		menu.setId(menuDTO.getId());
		menu.setName(menuDTO.getName());
		return menu;
	}

	public List<MenuDTO> convertToDTO(List<Menu> lsMenu) {
		List<MenuDTO> lsDTO = new ArrayList<MenuDTO>();
		for (Menu entity : lsMenu) {
			MenuDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<Menu> convertToEntity(List<MenuDTO> lsMenuDTO) {
		List<Menu> lsEntity = new ArrayList<Menu>();
		for (MenuDTO dto : lsMenuDTO) {
			Menu entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
