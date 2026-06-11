package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.JobDrive;
import service.JobService;

@RestController
@RequestMapping("/jobs")
@CrossOrigin("*")
public class JobController {

    @Autowired
    private JobService service;

    @PostMapping
    public JobDrive create(
            @RequestBody JobDrive job) {

        return service.create(job);
    }

    @GetMapping
    public List<JobDrive> getAll() {

        return service.getAll();
    }
}