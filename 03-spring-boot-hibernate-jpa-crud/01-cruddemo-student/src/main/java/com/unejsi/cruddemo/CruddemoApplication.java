package com.unejsi.cruddemo;

import com.unejsi.cruddemo.dao.StudentDao;
import com.unejsi.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			createStudent(studentDao);
//			createMultipleStudents(studentDao);
//          readStudent(studentDao);
//			queryForStudents(studentDao);
//			queryForStudentsByLastName(studentDao);
//			updateStudent(studentDao);
//			deleteStudent(studentDao);
//			deleteAllStudents(studentDao);
		};
	}

	private void deleteAllStudents(StudentDao studentDao) {
		System.out.println("Deleting all students...");
		int numOfRowsDeleted = studentDao.deleteAll();

		System.out.println("All Students deleted successfully. Number of students deleted: " + numOfRowsDeleted);
	}

	private void deleteStudent(StudentDao studentDao) {
		int studentId = 1;

		studentDao.delete(studentId);
	}

	private void updateStudent(StudentDao studentDao) {
		//id(primary key) of the student we want to update
		int stId = 1;

		//Retrieve student
		Student retrievedSt = studentDao.findById(stId);

		//Change the first name
		retrievedSt.setFirstName("Batman");

		//Update the info
		studentDao.update(retrievedSt);

		//New info of the student
		System.out.println(retrievedSt.toString());


	}

	private void queryForStudentsByLastName(StudentDao studentDao) {
		//Get students and store them in a list using the findAllByLastName() method in our DaoImpl
		List<Student> students = studentDao.findByLastName("Fisteku");

		//loop through students list and print each student
		for(Student tempStudent: students){
			System.out.println(tempStudent.toString());
		}
	}

	private void queryForStudents(StudentDao studentDao) {
		//Get students and store them in a list using the findAll() method in our DaoImpl
		List<Student> students = studentDao.findAll();

		//loop through students list and print each student
		for(Student tempStudent: students){
			System.out.println(tempStudent.toString());
		}
	}

	private void createMultipleStudents(StudentDao studentDao) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students do you want to create? ");
		int noSt = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<noSt; i++){
			System.out.println("Enter the student name: ");
			String stName = scanner.nextLine();
			System.out.println("Enter the student last name: ");
			String lName = scanner.nextLine();
			System.out.println("Enter the student email: ");
			String email = scanner.nextLine();

			Student tempStudent = new Student(stName, lName, email);
			studentDao.save(tempStudent);
		}
	}

	private void createStudent(StudentDao studentDao) {

		//create the student object
		System.out.println("Creating new obj...");
		Student tempStudent = new Student("Testing", "test", "test@gmail.com");

		//save the student object
		System.out.println("Saving the student to the database.");
		studentDao.save(tempStudent);

		//display id of the student object
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

    private void readStudent(StudentDao studentDao){
        //create the student object
        System.out.println("Creating new obj...");
        Student tempStudent = new Student("John", "Doe", "john.doe@gmail.com");
        //save the student object
        System.out.println("Saving the student to the database.");
        studentDao.save(tempStudent);


        //Searching for a student in the database using id
        Student foundSt = studentDao.findById(tempStudent.getId());
        System.out.println(foundSt.toString());
    }

}
