# 🎓 Student Management System (Spring MVC)

A **Student Management System** web application developed using **Spring MVC**, **Hibernate**, **JSP**, and **MySQL**.  
This project demonstrates a complete **MVC-based Java web application** with database integration and CRUD operations.

---

## 📌 Project Overview

The Student Management System allows users to manage student records through a web interface.  
It follows the **Spring MVC architecture**, uses **Hibernate ORM** for database interaction, and **JSP pages** for the view layer.

The application supports:
- Creating student records
- Viewing student details
- Updating student information
- Deleting students from the database


## Tech Stack

### Backend
- **Java 17**
- **Spring MVC**
- **Hibernate ORM**
- **Maven**

### Frontend
- **JSP (JavaServer Pages)**
- **HTML**
- **CSS**

### Database
- **MySQL**

### Server
- **Apache Tomcat**

---

## ✨ Features

✔ Spring MVC based layered architecture  
✔ CRUD operations using Hibernate  
✔ JSP-based dynamic web pages  
✔ MySQL database integration  
✔ Form handling and validations  
✔ Clean and maintainable code structure  

---

## 🏗 Application Architecture

Client (Browser)
↓
JSP Views
↓
Spring MVC Controller
↓
Service Layer
↓
DAO Layer (Hibernate)
↓
MySQL Database

---

## 📂 Project Structure

Student-Management-System
│
├── src/main/java
│ ├── controller
│ ├── service
│ ├── repository
│ └── beans
│
├── src/main/webapp
│ ├── WEB-INF
│ │ └── jsp
│ └── resources
│   └── hbm.xml
│
├── pom.xml
├── README.md
└── .gitignore


Make sure the following are installed on your system:

- Java **17**
- Maven
- MySQL
- Apache Tomcat (9 or above)
- IDE (IntelliJ IDEA / Eclipse / STS)

---

## 🗄 Database Configuration

1. Create a MySQL database:


## How to Run the Project
Step 1: Clone the Repository
git clone https://github.com/Venkata-Kishor-Polakattu/Student-Management-System.git

Step 2: Import into IDE
Open IDE
Import as Maven Project

Step 3: Configure Tomcat
Add Apache Tomcat server
Deploy the project

Step 4: Run the Application
Start the Tomcat server
Open browser and access


## Functional Flow

User accesses the application via browser
JSP pages render UI
Spring Controller handles requests
Service layer processes business logic
Hibernate interacts with MySQL database
Response is returned to JSP view

## 🧠 Key Learning Outcomes
Spring MVC architecture
Hibernate ORM with MySQL
JSP form handling
MVC request flow
Layered application design
Maven dependency management
Real-world Java web application structure


## Future Enhancements
Spring Boot migration
RESTful APIs
Frontend using Thymeleaf
Spring Security (Authentication & Authorization)
Pagination & search filters
Input validation improvements
