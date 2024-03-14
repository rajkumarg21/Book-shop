package com.raj.rest.api.BookShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.rest.api.BookShop.entities.Address;
import com.raj.rest.api.BookShop.entities.Login;
import com.raj.rest.api.BookShop.entities.User;
import com.raj.rest.api.BookShop.model.UserRegistrationModel;
import com.raj.rest.api.BookShop.repository.AddressRepository;
import com.raj.rest.api.BookShop.repository.LoginRepository;
import com.raj.rest.api.BookShop.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void registerUser(UserRegistrationModel userDTO) {
		// Create Login
		

		// Create User
		User user = new User();
		user.setEmail(userDTO.getEmail());
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setGender(userDTO.getGender());
		user.setDob(userDTO.getDob());
		user.setPhoneNumber(userDTO.getPhoneNumber());
		userRepository.save(user);

		
		// You should hash the password here
		Login login = new Login();
		login.setUsername(userDTO.getUsername());
		login.setPassword(userDTO.getPassword());
		login.setUser(user);
		loginRepository.save(login);
		// Create Address
		Address address = new Address();
		address.setUser(user);
		address.setHouseNo(userDTO.getHouseNo());
		address.setStreet1(userDTO.getStreet1());
		address.setStreet2(userDTO.getStreet2());
		address.setVillageCity(userDTO.getVillageCity());
		address.setDistrict(userDTO.getDistrict());
		address.setState(userDTO.getState());
		address.setCountry(userDTO.getCountry());
		address.setPincode(userDTO.getPincode());
		addressRepository.save(address);
	}
}
