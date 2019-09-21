package com.coffeeshopmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
