package com.coffeeshopmanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshopmanagement.Entity.Drink;
import com.coffeeshopmanagement.Repository.DrinkRepository;
import com.coffeeshopmanagement.Service.DrinkService;
@Service
public class DrinkServiceImpl implements DrinkService{

	@Autowired
	private DrinkRepository drinkRepo;
	
	@Override
	public List<Drink> findAllDrinks() {
		return drinkRepo.findAll();
	}

	@Override
	public Drink findById(int id) {
		return drinkRepo.findById(id).get();
	}

	@Override
	public List<Drink> findByName(String name) {		
		return drinkRepo.findByName(name);
	}

	@Override
	public void deleteById(int id) {
		drinkRepo.deleteById(id);
	}

	@Override
	public Drink addNewDrink(Drink drink) {
		Drink entity = drinkRepo.saveAndFlush(drink);
		return entity;
	}

	@Override
	public Drink editDrink(Drink drink) {
		Drink editedDrink = drinkRepo.findById(drink.getId()).get();
		editedDrink.setName(drink.getName());
		editedDrink.setImage(drink.getName());
		editedDrink.setUnitPrice(drink.getUnitPrice());
		editedDrink.setIdMenu(drink.getIdMenu());
		Drink entity = drinkRepo.saveAndFlush(editedDrink);
		return entity;
	}

	@Override
	public List<Drink> findByMenu(int id) {
		List<Drink> drinks = drinkRepo.findByMenu(id);
		return drinks;
	}

}
