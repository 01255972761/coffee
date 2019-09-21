package com.coffeeshopmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}
