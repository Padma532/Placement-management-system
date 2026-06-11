package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Application;

public interface ApplicationRepository
        extends JpaRepository<Application, Long> {
}