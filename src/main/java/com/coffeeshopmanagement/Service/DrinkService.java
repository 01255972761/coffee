package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.Drink;

public interface DrinkService {
	public List<Drink> findAllDrinks();

	public Drink findById(int id);

	public List<Drink> findByName(String name);
	
	public List<Drink> findByMenu(int id);

	public void deleteById(int id);

	public Drink addNewDrink(Drink drink);

	public Drink editDrink(Drink drink);
}
