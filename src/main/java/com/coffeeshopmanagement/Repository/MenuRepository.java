package com.coffeeshopmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
