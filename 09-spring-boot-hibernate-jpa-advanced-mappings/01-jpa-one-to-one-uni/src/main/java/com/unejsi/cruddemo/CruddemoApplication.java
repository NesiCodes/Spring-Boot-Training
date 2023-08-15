package com.unejsi.cruddemo;

import com.unejsi.cruddemo.dao.AppDao;
import com.unejsi.cruddemo.entity.Instructor;
import com.unejsi.cruddemo.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao appDao){

        return runner -> {
            //createInstructor(appDao);
            findInstructor(appDao);
            //deleteInstructor(appDao);
        };
    }

    private void deleteInstructor(AppDao appDao) {
        int id=2;

        System.out.println("Deleting instructor with id: " + id);
        appDao.deleteInstructorById(id);
        System.out.println("Done");
    }

    private void findInstructor(AppDao appDao) {
        int id=1;
        System.out.println("Finding instructor with id: " + id);

        Instructor instructor = appDao.findInstructorById(id);

        System.out.println("Instructor : " + instructor.toString());
        System.out.println("The associated instructor details only: " + instructor.getInstructorDetails());
    }

    private void createInstructor(AppDao appDao) {
        Instructor instructor = new Instructor("John", "Doe", "john@gmail.com");

        InstructorDetails instructorDetails = new InstructorDetails("youtube.com/john", "Guitar");

        instructor.setInstructorDetails(instructorDetails);

        System.out.println("Saving instructor: " + instructor.toString());

        appDao.save(instructor);

        System.out.println("Done");
    }

}
