package com.test.security;

import com.test.security.model.User;
import com.test.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class TestSecurity2Application implements CommandLineRunner {
	@Autowired
	private PasswordEncoder passwordEncoder;

	
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestSecurity2Application.class, args);
		System.out.println("Application is Running...");
	}
	
	@Override
	public void run(String... args) throws Exception {
//		User a1 = new User();
//		a1.setFullname("Amit Kumar");
//		a1.setUsername("amit98");
//		a1.setRole("ADMIN");
//		a1.setPassword(passwordEncoder.encode("amit"));
//		userRepository.save(a1);
//
//		User a2 = new User();
//		a2.setUsername("Ravi Sharma");
//		a1.setUsername("ravi44");
//		a1.setRole("ADMIN");
//		a1.setPassword(passwordEncoder.encode("ravi"));
//		userRepository.save(a2);
	}
}
