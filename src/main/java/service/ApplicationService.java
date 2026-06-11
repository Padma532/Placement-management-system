package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Application;
import repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    public Application save(Application app) {
        return repository.save(app);
    }

    public List<Application> getAll() {
        return repository.findAll();
    }
}