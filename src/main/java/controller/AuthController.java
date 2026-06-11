package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.User;
import security.LoginRequest;
import service.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserService service;
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        return service.login(
                request.getEmail(),
                request.getPassword());
    }
    @PostMapping("/register")
    public User register(
            @RequestBody User user) {

        return service.register(user);
    }
}