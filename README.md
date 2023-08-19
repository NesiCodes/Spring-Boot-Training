# Spring Boot Training

This repository contains my progress and notes for **Spring Boot 3, Spring 6 & Hibernate for Beginners**. The course is divided into several sections, each focusing on a different topic.
<br>Link of the course: https://www.udemy.com/course/spring-hibernate-tutorial/

## Course Overview

This course covers Spring Boot 3 and Spring 6 topics such as: Spring Boot 3 Core, Spring Boot 3 Annotations ,Spring Boot 3 Java Configuration (all Java, no xml), Spring Boot 3 and Spring MVC, Spring Boot 3 Hibernate/JPA CRUD, Spring Boot 3 Security, Spring Boot 3 REST API, Maven.

## Sections

### Section 1: Spring Boot 3 Quick Start

- **Description**: An introductiom to Spring Boot where you learn how to set up a Spring Boot 3 project, maven project structure, manage dependencies, and make us of the framework's auto-configuration capabilities.
- **Key Concepts**: What is Spring Boot<br>
Creating a Project with Spring Boot Initializr<br>
Explore the Spring Boot Project Structure<br>
Leverage Spring Boot Starters - A Curated List of Dependencies<br>
Inherit Defaults with Spring Boot Starter Parents<br>
Automatically Restart with Spring Boot Dev Tools<br>
Run Spring Boot apps from the Command-Line<br>
Use the Spring Boot Maven Plugin to package and run Spring Boot apps<br>
Inject custom application properties into a Spring Boot REST Controller<br>

### Section 2: Spring Boot Core

- **Description**: Focuses mostly on Spring Beans, Inversion of Control, Dependency Injection and their corresponding properties.
- **Key Concepts**: Wire beans together in the Spring container using Inversion of Control, Configure the Spring container for Dependency Injection, Define Spring Beans using the Component annotation, Perform auto-scanning of Spring beans to minimize configuration, Automatically wire beans together using Autowired annotation, Apply all Java configuration to Spring Beans (no xml)

### Section 3: Hibernate/JPA CRUD

- **Description**: Covers Hibernate/JPA and JDBC with making use of MySql database
- **Key Concepts**: JPA Annotations, Creating Database Tables java code/sql, CRUD operations on the Database, Minimize boilerplate code with Spring Data JPA and the JpaRepository, Refactor existing REST API to integrate with Spring Data JPA, Leverage new features of the the Java Optional pattern with JpaRepository, Test the Spring Data JPA repository with Postman, Accelerate your development process with Spring Data REST, Leverage Spring, Data REST to eliminate custom code for controllers and service, Automatically expose REST endpoints for your JPA Repositories

### Section 4: REST CRUD APIs

- **Description**: Covers REST Services and CRUD operations based on requests
- **Key Concepts**: Overview of REST APIs, Investigating Spring Boot REST support, Sending JSON data over HTTP, JSON Data Binding with the Jackson projectm Converting JSON data to Java POJO with Jackson, Developing a Spring Boot REST API, Creating the Spring Boot REST Controller using RestController, Testing Spring Boot REST Web Services with Postman, Parameterize Spring Boot REST API endpoints using PathVariable, Add Spring Boot REST exception handling with ExceptionHandler, Integrate global Spring Boot REST exception handling with ControllerAdvice, Build Spring Boot REST API to execute CRUD actions on the Database with Hibernate/JPA

### Section 5: REST Api Security

- **Description**: Securing the endpoints and restricting access based on Authentication and User Roles, making use of the bcrypt encryption algorithm.
- **Key Concepts**: Leverage Spring Boot Security support for Cross Site Request Forgery (CSRF), Define users and roles for authentication, Display user login info and role using Spring Boot Security tags, Restrict access to URLs based on user role, Hide and Display content based on user role, Add JDBC authentication, store user accounts and passwords in the database, Store encrypted passwords in the database using bcrypt, Register new users and encrypt passwords using Java code

### Section 6: Spring MVC

- **Description**: Developing Spring MVC apalications with Thymeleaf. Focusing on Validation on fields.
- **Key Concepts**: Create controllers using Controller annotation, Read HTML form data using RequestParam, Leverage Spring Boot MVC model to transport data between controller and view page, Define Request Mappings for GET and POST requests, Minimize coding with Spring Boot MVC Form data binding, Leverage Thymeleaf expressions to access data from the Spring Boot MVC Model, Apply CSS stylesheets to your Thymeleaf templates, Create a Spring MVC Validation project using the Spring Initializr website, Apply validation rules for required fields, number ranges and regular expressions, Leverage the InitBinder and StringTrimmerEditor to trim white spaces, Configure error messages using the messages properties file, Develop a custom validation rule using annotations

### Section 7: Spring MVC CRUD

- **Description**: Developing an Spring MVC CRUD applicatio nwith Thymeleaf and Spring Data JPA. Creating a small Employee Management project.
- **Key Concepts**: Develop a real-time project with Thymeleaf and Spring Boot with full database CRUD support, Integrate the Repository to execute CRUD actions on the Database with Spring Data JPA, Apply best practices with the Service layer design pattern, Create a Controller to handle web browser requests, Develop Thymeleaf templates to render database results, Beautify your Thymeleaf templates with Bootstrap CSS

### Section 8: Spring MVC Security

- **Description**: Securing endpoints for Authenticated users and Roles. Creating a custom form for authentication.
- **Key Concepts**: Create custom Spring Boot Security login pages with Bootstrap CSS, Add logout support using default features of Spring Boot Security, Define users and roles for authentication, Display user login info and role using Spring Boot Security tags, Restrict access to URLs based on user role, Hide and Display content based on user role, Add JDBC authentication, store user accounts and passwords in the database, Store encrypted passwords in the database using bcrypt, Register new users and encrypt passwords using Java code Create a Spring Security Real-Time Project using authorization, authentication and database encryption


### Section 9: JPA/Hibernate Advanced Mappings

- **Description**: Exploring JPA/Hibernate Annotations used for Mapping and creating relations between database tables. Developing an CRUD application based on a Entity Relation Diagram.
- **Key Concepts**: Setting up database tables with mysql, Creating @Entity Java class, Mapping Java entities with database tables, Creating relations between tables using Foreign Keys, Mapping entities with @OneToOne, @OneToMany, @ManyToOne and @ManyToMany annotations, Exploring Uni and Bi Directional relations, Exploring EAGER and LAZY loading fetch types, Learning about Cascading and its types, Perfoming CRUD operations.

### Section 10: AOP: Aspect-Oriented Programming

- **Description**: Learning AOP: dealing with cross-cutting concerns. This sections focuses on using Spring Aop for logging
- **Key Concepts**: Set up a Spring Boot project for AOP, Apply AOP concepts: Aspects, advices, and pointcut expressions, Add logging messages using the Before advice, Define pointcut expressions to match on parameters, return types, and packages, Create reusable pointcut expressions, Combine pointcut expressions using logical operators, Control the execution order of aspects using Order, Access method execution metadata using JoinPoints, Leverage JoinPoints to read method arguments, Apply an AfterReturning advice to post-process the data, Integrate AfterThrowing advice to access exceptions, Develop an AOP Advice using Around to pre-process and post-process method calls, Integrate AOP into a Spring MVC CRUD app.


## How to Use This Repository

If you're following along with the sections of the course or want to review specific sections:

1. Clone this repository to your local machine using: `git clone https://github.com/NesiCodes/Spring-Boot-Training.git`
2. Navigate to the relevant section's folder
3. Review the files, notes, and commits related to that section.

## Contributions

If you find any errors, have additional insights, or want to contribute, feel free to create issues or pull requests. Contributions are welcome!

## About Me

👋 I'm Unejsi Isufaj a young developer fascinated by technology and always curious to learn new things. 
Interested in Back-End development, I took this course to learn how to develop fast and efficient web applications using Spring Boot and to gain skills that would help me enhance my career as a Back-End developer.

## Contact Information

Open to networking!
Linkedin: Unejsi Isufaj https://www.linkedin.com/in/unejsi-isufaj-156124143/ <br>
Personal portofolio website: https://www.unejsi.pythonanywhere.com

