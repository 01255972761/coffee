package com.coffeeshopmanagement.RestController;

import java.util.ArrayList;
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

import com.coffeeshopmanagement.Converter.DrinkConverter;
import com.coffeeshopmanagement.DTO.DrinkDTO;
import com.coffeeshopmanagement.Entity.Drink;
import com.coffeeshopmanagement.Service.DrinkService;

@RestController
@RequestMapping("/api")
public class DrinkRestController {
	
	@Autowired
	private DrinkService drinkService;
	
	@Autowired
	private DrinkConverter drinkConverter;
	
	@GetMapping("/drink/find-all")
	public List<DrinkDTO> findAllMenu(){
		List<Drink> lsDrink =  new ArrayList<Drink>();
		lsDrink = drinkService.findAllDrinks();
		return drinkConverter.convertToDTO(lsDrink);
	}
	
	@GetMapping("/drink/find-by-id/{id}")
	public DrinkDTO findById(@PathVariable int id) {
		return drinkConverter.convertToDTO(drinkService.findById(id));
	}
	
	@GetMapping("/drink/find-by-name/{name}")
	public List<DrinkDTO> findByName(@PathVariable String name) {
		return drinkConverter.convertToDTO(drinkService.findByName(name));
	}
	
	@GetMapping("/drink/find-by-menu/{id}")
	public List<DrinkDTO> findByMenu(@PathVariable int id) {
		return drinkConverter.convertToDTO(drinkService.findByMenu(id));
	}
	
	@PostMapping("/drink/add-drink")
	public DrinkDTO addNewDrink(@RequestBody DrinkDTO drinkDTO) {
		Drink drink = drinkConverter.convertToEntity(drinkDTO);
		DrinkDTO dto = drinkConverter.convertToDTO(drinkService.addNewDrink(drink));
		return dto;
	}
	
	@DeleteMapping("/drink/delete-drink/{id}")
	public void deleteDrink(@PathVariable int id) {
		drinkService.deleteById(id);
	}
	
	@PutMapping("/drink/edit-drink")
	public DrinkDTO editDrink(@RequestBody DrinkDTO drinkDTO) {
		Drink drink = drinkConverter.convertToEntity(drinkDTO);
		DrinkDTO dto = drinkConverter.convertToDTO(drinkService.editDrink(drink));
		return dto;
	}
}
