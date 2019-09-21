package com.coffeeshopmanagement.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeshopmanagement.Converter.MenuConverter;
import com.coffeeshopmanagement.DTO.MenuDTO;
import com.coffeeshopmanagement.Entity.Menu;
import com.coffeeshopmanagement.Repository.MenuRepository;
import com.coffeeshopmanagement.Service.MenuService;

@RestController
@RequestMapping("/api")
public class MenuRestController {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private MenuConverter menuConverter;
	
	@GetMapping("/menu/find-all")
	public List<MenuDTO> findAllMenu(){
		return menuConverter.convertToDTO(menuService.findAllMenu());
	}
	
	@GetMapping("/menu/find-by-id/{id}")
	public MenuDTO findById(@PathVariable int id) {
		return menuConverter.convertToDTO(menuService.findById(id));
	}
	
	@PostMapping("/menu/add-menu")
	public MenuDTO addNewMenu(@RequestBody MenuDTO menudto) {
		Menu menu = menuConverter.convertToEntity(menudto);
		MenuDTO dto = menuConverter.convertToDTO(menuService.addNewMenu(menu));
		return dto;
	}
	
	@DeleteMapping("/menu/delete-menu/{id}")
	public void deleteMenu(@PathVariable int id) {
		menuService.deleteById(id);
	}
	
	@PutMapping("/menu/edit-menu")
	public MenuDTO editUser(@RequestBody Menu menu) {
		MenuDTO dto = menuConverter.convertToDTO(menuService.editMenu(menu));
		return dto;
	}
}
