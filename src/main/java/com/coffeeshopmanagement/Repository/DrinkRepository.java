package com.coffeeshopmanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
	@Query("select d from Drink d where d.name=?1")
	List<Drink> findByName(String name);
	
	@Query("select d from Drink d where d.idMenu=?1")
	List<Drink> findByMenu(int id);
}

