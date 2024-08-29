# Employee_Management_System 


![image](https://github.com/user-attachments/assets/191ea20c-dcb6-4c73-be9c-c5d789905993)

The Employee Management System is a web application built using Spring Boot, Thymeleaf, and Spring Data JPA. This system follows the Model-View-Controller (MVC) architecture to perform CRUD (Create, Read, Update, Delete) operations on employee records. It provides an organized and efficient way to manage employees within an organization.

## Features

- **Create Employee**: Add new employees to the system.
- **Read Employee**: View a list of all employees and individual employee details.
- **Update Employee**: Edit existing employee information.
- **Delete Employee**: Remove employees from the system.

## Technologies Used

- **Spring Boot**: Backend framework to build the application and manage dependencies.
- **Thymeleaf**: Templating engine used in the view layer to dynamically generate HTML pages.
- **Spring Data JPA**: To manage and interact with the database using JPA (Java Persistence API).
- **MySQL**: Used MySQL database.
- **Maven**: For project management and dependency management.

## Architecture

The application is structured according to the MVC (Model-View-Controller) design pattern:

- **Model**: Represents the application's data and business logic. In this project, the `Employee` class represents the model.
- **View**: Represents the presentation layer. Thymeleaf templates are used to generate dynamic HTML pages.
- **Controller**: Handles the user input and interacts with the model to perform CRUD operations. The controllers manage the flow of the application.

## Getting Started

### Prerequisites

- **Java 17** or later installed.
- **Maven** installed for managing project dependencies.
- **Spring Tool Suit** or later installed.
