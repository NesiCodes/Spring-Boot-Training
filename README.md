# Spring Boot Training

This repository contains my progress and notes for **Spring Boot 3, Spring 6 & Hibernate for Beginners**. The course is divided into several sections, each focusing on a different topic.
<br>Link of the course: https://www.udemy.com/course/spring-hibernate-tutorial/

## Course Overview

This course covers Spring Boot 3 and Spring 6 topics such as: Spring Boot 3 Core, Spring Boot 3 Annotations ,Spring Boot 3 Java Configuration (all Java, no xml), Spring Boot 3 and Spring MVC, Spring Boot 3 Hibernate/JPA CRUD, Spring Boot 3 Security, Spring Boot 3 REST API, Maven.

## Sections

### Section 1: Spring Boot 3 Quick Start

- **Description**: An introductiom to Spring Boot where you learn how to set up a Spring Boot 3 project, maven project structure, manage dependencies, and make us of the framework's auto-configuration capabilities.
- **Key Concepts**:<br> What is Spring Boot<br>
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
- **Key Concepts**: <br>Wire beans together in the Spring container using Inversion of Control<br>
Configure the Spring container for Dependency Injection
<br>Define Spring Beans using the Component annotation
<br>Perform auto-scanning of Spring beans to minimize configuration
<br>Automatically wire beans together using Autowired annotation<br>
Apply all Java configuration to Spring Beans (no xml)

### Section 3: Hibernate/JPA CRUD

- **Description**: Covers Hibernate/JPA and JDBC with making use of MySql database
- **Key Concepts**: <br>JPA Annotations
<br>Creating Database Tables java code/sql
<br>CRUD operations on the Database
<br>Minimize boilerplate code with Spring Data JPA and the JpaRepository
<br>Refactor existing REST API to integrate with Spring Data JPA
<br>Leverage new features of the the Java Optional pattern with JpaRepository
<br>Test the Spring Data JPA repository with Postman
<br>Accelerate your development process with Spring Data REST
<br>Leverage Spring
<br>Data REST to eliminate custom code for controllers and service
<br>Automatically expose REST endpoints for your JPA Repositories

### Section 4: REST CRUD APIs

- **Description**: Covers REST Services and CRUD operations based on requests
- **Key Concepts**:<br> Overview of REST APIs
<br>Investigating Spring Boot REST support
<br>Sending JSON data over HTTP
<br>JSON Data Binding with the Jackson projectm Converting JSON data to Java POJO with Jackson
<br>Developing a Spring Boot REST API
<br>Creating the Spring Boot REST Controller using RestController
<br>Testing Spring Boot REST Web Services with Postman
<br>Parameterize Spring Boot REST API endpoints using PathVariable
<br>Add Spring Boot REST exception handling with ExceptionHandler
<br>Integrate global Spring Boot REST exception handling with ControllerAdvice
<br>Build Spring Boot REST API to execute CRUD actions on the Database with Hibernate/JPA

### Section 5: REST Api Security

- **Description**: Securing the endpoints and restricting access based on Authentication and User Roles, making use of the bcrypt encryption algorithm.
- **Key Concepts**: <br>Leverage Spring Boot Security support for Cross Site Request Forgery (CSRF)
<br>Define users and roles for authentication
<br>Display user login info and role using Spring Boot Security tags
<br>Restrict access to URLs based on user role, Hide and Display content based on user role
<br>Add JDBC authentication store user accounts and passwords in the database
<br>Store encrypted passwords in the database using bcrypt
<br>Register new users and encrypt passwords using Java code

### Section 6: Spring MVC

- **Description**: Developing Spring MVC apalications with Thymeleaf. Focusing on Validation on fields.
- **Key Concepts**: <br>Create controllers using Controller annotation
<br>Read HTML form data using RequestParam
<br>Leverage Spring Boot MVC model to transport data between controller and view page
<br>Define Request Mappings for GET and POST requests
<br>Minimize coding with Spring Boot MVC Form data binding
<br>Leverage Thymeleaf expressions to access data from the Spring Boot MVC Model
<br>Apply CSS stylesheets to your Thymeleaf templates
<br>Create a Spring MVC Validation project using the Spring Initializr website
<br>Apply validation rules for required fields, number ranges and regular expressions
<br>Leverage the InitBinder and StringTrimmerEditor to trim white spaces
<br>Configure error messages using the messages properties file, Develop a custom validation rule using annotations

### Section 7: Spring MVC CRUD

- **Description**: Developing an Spring MVC CRUD applicatio nwith Thymeleaf and Spring Data JPA. Creating a small Employee Management project.
- **Key Concepts**:<br> Develop a real-time project with Thymeleaf and Spring Boot with full database CRUD support
<br>Integrate the Repository to execute CRUD actions on the Database with Spring Data JPA
<br>Apply best practices with the Service layer design pattern, Create a Controller to handle web browser requests
<br>Develop Thymeleaf templates to render database results, Beautify your Thymeleaf templates with Bootstrap CSS

### Section 8: Spring MVC Security

- **Description**: Securing endpoints for Authenticated users and Roles. Creating a custom form for authentication.
- **Key Concepts**:<br> Create custom Spring Boot Security login pages with Bootstrap CSS
<br>Add logout support using default features of Spring Boot Security, Define users and roles for authentication
<br>Display user login info and role using Spring Boot Security tags
<br>Restrict access to URLs based on user role
<br>Hide and Display content based on user role
<br>Add JDBC authentication, store user accounts and passwords in the database
<br>Store encrypted passwords in the database using bcrypt
<br>Register new users and encrypt passwords using Java code
<br>Create a Spring Security Real-Time Project using authorization, authentication and database encryption


### Section 9: JPA/Hibernate Advanced Mappings

- **Description**: Exploring JPA/Hibernate Annotations used for Mapping and creating relations between database tables. Developing an CRUD application based on a Entity Relation Diagram.
- **Key Concepts**: <br>Setting up database tables with mysql
<br>Creating @Entity Java class
<br>Mapping Java entities with database tables
<br>Creating relations between tables using Foreign Keys
<br>Mapping entities with @OneToOne, @OneToMany, @ManyToOne and @ManyToMany annotations
<br>Exploring Uni and Bi Directional relations, Exploring EAGER and LAZY loading fetch types
<br>Learning about Cascading and its types, Perfoming CRUD operations.

### Section 10: AOP: Aspect-Oriented Programming

- **Description**: Learning AOP: dealing with cross-cutting concerns. This sections focuses on using Spring Aop for logging
- **Key Concepts**: <br>Set up a Spring Boot project for AOP
<br>Apply AOP concepts: Aspects, advices, and pointcut expressions
<br>Add logging messages using the Before advice
<br>Define pointcut expressions to match on parameters, return types, and packages
<br>Create reusable pointcut expressions
<br>Combine pointcut expressions using logical operators
<br>Control the execution order of aspects using Order
<br>Access method execution metadata using JoinPoints
<br>Leverage JoinPoints to read method arguments
<br>Apply an AfterReturning advice to post-process the data
<br>Integrate AfterThrowing advice to access exceptions
<br>Develop an AOP Advice using Around to pre-process and post-process method calls
<br>Integrate AOP into a Spring MVC CRUD app.


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

