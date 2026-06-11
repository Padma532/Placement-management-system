package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.JobDrive;

public interface JobRepository
        extends JpaRepository<JobDrive, Long> {
}