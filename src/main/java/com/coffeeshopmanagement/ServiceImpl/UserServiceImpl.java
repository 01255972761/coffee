package com.coffeeshopmanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshopmanagement.Entity.User;
import com.coffeeshopmanagement.Repository.UserRepository;
import com.coffeeshopmanagement.Service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	@Override
	public List<User> findAllUser() {
		List<User> lsUser = userRepo.findAll();
		return lsUser;
	}

	@Override
	public User findById(int id) {
		User user = userRepo.findById(id).get();
		return user;
	}

	@Override
	public User addNewUser(User newUser) {
		User user = userRepo.saveAndFlush(newUser);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public User editUser(User editedUser) {
		User user = userRepo.findById(editedUser.getId()).get();
		user = editedUser;
		User savedUser = userRepo.saveAndFlush(user);
		return savedUser;
	}

}
