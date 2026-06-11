package entity;

import jakarta.persistence.*;

@Entity
public class JobDrive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;
    private Double minimumCgpa;
    private String description;

    // Getters & Setters
}