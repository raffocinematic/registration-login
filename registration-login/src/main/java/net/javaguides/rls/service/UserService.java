package net.javaguides.rls.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.rls.model.User;
import net.javaguides.rls.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
