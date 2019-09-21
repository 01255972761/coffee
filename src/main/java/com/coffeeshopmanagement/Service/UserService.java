package com.coffeeshopmanagement.Service;

import java.util.List;

import com.coffeeshopmanagement.Entity.User;

public interface UserService {
	public List<User> findAllUser();
	
	public User findById(int id);
	
	public User addNewUser(User User);
	
	public void deleteUser(int id);
	
	public User editUser(User User);
}
