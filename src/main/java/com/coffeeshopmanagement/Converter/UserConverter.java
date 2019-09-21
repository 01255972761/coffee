package com.coffeeshopmanagement.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coffeeshopmanagement.DTO.UserDTO;
import com.coffeeshopmanagement.Entity.User;
@Component
public class UserConverter {
	public UserDTO convertToDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setUserName(user.getUserName());
		userDTO.setPassword(user.getPassword());
		return userDTO;
	}

	public User convertToEntity(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setUserName(userDTO.getUserName());
		user.setPassword(userDTO.getPassword());
		return user;
	}

	public List<UserDTO> convertToDTO(List<User> lsUser) {
		List<UserDTO> lsDTO = new ArrayList<UserDTO>();
		for (User entity : lsUser) {
			UserDTO dto = convertToDTO(entity);
			lsDTO.add(dto);
		}
		return lsDTO;
	}

	public List<User> convertToEntity(List<UserDTO> lsUserDTO) {
		List<User> lsEntity = new ArrayList<User>();
		for (UserDTO dto : lsUserDTO) {
			User entity = convertToEntity(dto);
			lsEntity.add(entity);
		}
		return lsEntity;
	}
}
