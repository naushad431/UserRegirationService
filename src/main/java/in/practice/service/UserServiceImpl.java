package in.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import in.practice.dto.UserDto;
import in.practice.entity.UserEntity;
import in.practice.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto dto) {
		// TODO Auto-generated method stub
		UserEntity entity=UserEntity.builder()
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.email(dto.getEmail())
				.mobileNumber(dto.getMobileNumber())
				.build();
		
		userRepository.save(entity);
		
		return UserDto.builder()
				.firstName(entity.getFirstName())
				.lastName(entity.getLastName())
				.email(entity.getEmail())
				.mobileNumber(entity.getMobileNumber())
				.build();
		
	}

}
