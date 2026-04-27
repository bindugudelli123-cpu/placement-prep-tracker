# placement-prep-tracker
# Placement Preparation & Interview Tracker System

A full-stack web application built to help students and fresh graduates manage their placement journey efficiently.
## Objective
The main goal of this project is to centralize:
- job application tracking
- DSA progress
- interview scheduling
- learning resources
- resume and GitHub management

## Features
* User registration and management
* Job application tracking
* Search applications by company name
* Interview preparation tracking
* MySQL database integration
* REST API development using Spring Boot

## API Endpoints
### User APIs

POST /api/users
GET /api/users

### Job Application APIs

POST /api/job-applications
GET /api/job-applications
GET /api/job-applications/company/{companyName}



## Tech Stack
* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman
* GitHub
* Eclipse IDE


## Run Locally
1. Clone the repository
2. Open project in Eclipse IDE
3. Create MySQL database: placement_tracker
4. Update application.properties with MySQL username and password
5. Run TrackerApplication.java
6. Test APIs using Postman


##  Project Structure
text
frontend/
backend/
docs/
screenshots/
