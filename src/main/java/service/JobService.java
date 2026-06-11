package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.JobDrive;
import repository.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public JobDrive create(JobDrive job) {
        return repository.save(job);
    }

    public List<JobDrive> getAll() {
        return repository.findAll();
    }
}