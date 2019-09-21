package com.coffeeshopmanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshopmanagement.Entity.Menu;
import com.coffeeshopmanagement.Repository.MenuRepository;
import com.coffeeshopmanagement.Service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuRepository menuRepo;
	
	@Override
	public List<Menu> findAllMenu() {
		return menuRepo.findAll();
	}

	@Override
	public Menu findById(int id) {
		return menuRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		menuRepo.deleteById(id);
	}

	@Override
	public Menu addNewMenu(Menu menu) {
		Menu entity = menuRepo.saveAndFlush(menu);
		return entity;
	}

	@Override
	public Menu editMenu(Menu menu) {
		Menu editedMenu = menuRepo.findById(menu.getId()).get();
		editedMenu.setName(menu.getName());
		return menuRepo.saveAndFlush(editedMenu);
	}

}
