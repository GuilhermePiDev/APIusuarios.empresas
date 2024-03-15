package com.project.apirestfull.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
	
import com.project.apirestfull.dto.UserDto;
import com.project.apirestfull.models.User;

@Component
public class UserMapper {
	
	@Autowired
	private ModelMapper mapper;
	
	public User toEntity(UserDto dtoUser) {
		User entity = mapper.map(dtoUser, User.class );
		return entity;
	}
	public UserDto toDto(User user) {
		UserDto dto = mapper.map(user, UserDto.class );
		return dto;
	}

}
