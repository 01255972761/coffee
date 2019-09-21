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

import com.coffeeshopmanagement.Converter.UserConverter;
import com.coffeeshopmanagement.DTO.UserDTO;
import com.coffeeshopmanagement.Entity.User;
import com.coffeeshopmanagement.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired 
	private UserService userService;
	
	@Autowired 
	private UserConverter userConverter;
	
	@GetMapping("/user/find-all")
	public List<UserDTO> findAllUser(){
		return userConverter.convertToDTO(userService.findAllUser());
	}
	
	@GetMapping("/user/find-by-id/{id}")
	public UserDTO findById(@PathVariable int id) {
		return userConverter.convertToDTO(userService.findById(id));
	}
	
	@PostMapping("/add-user")
	public UserDTO addNewUser(@RequestBody UserDTO userDTO) {
		User user = userConverter.convertToEntity(userDTO);
		UserDTO dto = userConverter.convertToDTO(userService.addNewUser(user));
		return dto;
	}
	
	@DeleteMapping("/delete-user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@PutMapping("/edit-user")
	public UserDTO editUser(@RequestBody UserDTO userDTO) {
		User user = userConverter.convertToEntity(userDTO);
		UserDTO dto = userConverter.convertToDTO(userService.editUser(user));
		return dto;
	}
}
