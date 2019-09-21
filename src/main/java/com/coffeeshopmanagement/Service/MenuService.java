package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.Menu;

public interface MenuService {
	public List<Menu> findAllMenu();
	
	public Menu findById(int id);
	
	public void deleteById(int id);
	
	public Menu addNewMenu(Menu menu);
	
	public Menu editMenu(Menu menu);
}
