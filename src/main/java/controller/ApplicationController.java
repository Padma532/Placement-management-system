package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Application;
import service.ApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin("*")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping
    public Application apply(
            @RequestBody Application app) {

        return service.save(app);
    }

    @GetMapping
    public List<Application> getAll() {

        return service.getAll();
    }
}