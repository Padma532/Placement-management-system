# Placement Management System

## Overview

The Placement Management System is a full-stack web application developed to streamline campus recruitment activities. The system provides separate portals for Students, Recruiters, and Administrators, enabling efficient management of job drives, applications, and placement records.

## Features

### Student Module

* Student Registration and Login
* View Available Job Drives
* Apply for Job Opportunities
* Track Application Status
* Manage Profile Information

### Recruiter Module

* Recruiter Registration and Login
* Create Job Drives
* Manage Job Postings
* View Student Applications
* Shortlist Candidates

### Admin Module

* Manage Students
* Manage Recruiters
* Monitor Job Drives
* Update Placement Status
* Generate Placement Reports

## Technology Stack

### Frontend

* React.js 17
* JavaScript
* HTML5
* CSS3
* Axios

### Backend

* Spring Boot 3
* Spring Security
* JWT Authentication
* REST APIs

### Database

* MySQL 8

### Build Tool

* Maven

## Project Structure

placement-management-system

├── src/main/java

│ ├── controller

│ ├── entity

│ ├── repository

│ ├── security

│ └── service

├── src/main/resources

│ └── application.properties

├── pom.xml

└── README.md

## Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE pmsdb;
```

Update application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pmsdb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Installation Steps

### Clone Repository

```bash
git clone https://github.com/Padma532/Placement-management-system.git
```

### Navigate to Project

```bash
cd Placement-management-system
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

## API Endpoints

### Authentication

| Method | Endpoint       |
| ------ | -------------- |
| POST   | /auth/register |
| POST   | /auth/login    |

### Jobs

| Method | Endpoint |
| ------ | -------- |
| GET    | /jobs    |
| POST   | /jobs    |

### Applications

| Method | Endpoint      |
| ------ | ------------- |
| GET    | /applications |
| POST   | /applications |

## Security Features

* JWT Authentication
* Spring Security Integration
* Password Encryption using BCrypt
* Role-Based Access Control
* Protected REST APIs

## Future Enhancements

* Resume Upload Feature
* Email Notifications
* Interview Scheduling
* Placement Analytics Dashboard
* Company-wise Reports

## Author

Thonduru Padmasree


GitHub:
https://github.com/Padma532
