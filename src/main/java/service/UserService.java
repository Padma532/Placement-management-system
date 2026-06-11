package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;
import security.JwtUtil;

@Service
public class UserService {

	@Autowired
	private BCryptPasswordEncoder encoder;
	@Autowired
	private UserRepository repository;

	public User register(User user) {

	    user.setPassword(
	            encoder.encode(
	                    user.getPassword()));

	    return repository.save(user);
	}

	public String login(
	        String email,
	        String password) {

	    User user = repository
	            .findByEmail(email)
	            .orElseThrow();

	    if (encoder.matches(
	            password,
	            user.getPassword())) {

	        JwtUtil jwtUtil =
	                new JwtUtil();

	        return jwtUtil.generateToken(
	                email);
	    }

	    return "Invalid Login";
	}
}