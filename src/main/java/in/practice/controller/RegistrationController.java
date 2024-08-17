package in.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.practice.dto.UserDto;
import in.practice.service.IUserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	private IUserService userService;
	
	@PostMapping
	public UserDto createUser(@Valid @RequestBody UserDto dto) {
		return userService.createUser(dto);
	}
	
	
}
