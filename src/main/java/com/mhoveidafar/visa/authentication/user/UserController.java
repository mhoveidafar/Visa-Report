package com.mhoveidafar.visa.authentication.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

//	The encryption process is handled by an instance of BCryptPasswordEncoder --> is a class that belongs to the Spring Security framework.
	
	private ApplicationUserRepository applicationUserRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserController(ApplicationUserRepository applicationUserRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {

		this.applicationUserRepository = applicationUserRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@PostMapping("/sign-up")
	public void signUp(@RequestBody ApplicationUser user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		applicationUserRepository.save(user);
	}
}
