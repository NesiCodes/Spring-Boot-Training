package com.unejsi.cruddemo;

import com.unejsi.cruddemo.dao.AppDao;
import com.unejsi.cruddemo.entity.Course;
import com.unejsi.cruddemo.entity.Instructor;
import com.unejsi.cruddemo.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao appDao){

        return runner -> {
            //createInstructor(appDao);
            //findInstructor(appDao);
            //deleteInstructor(appDao);
            //findInstructorDetails(appDao);
            //deleteInstructorDetails(appDao);

            //createInstructorWithCourses(appDao);

            //findInstructorWithCourses(appDao);

            //findCoursesWithInstructor(appDao);
            //findInstructorWithCoursesJoinFetch(appDao);

            //updateInstructor(appDao);

            //updateCourse(appDao);

            //deleteInstructor(appDao);

            deleteCourse(appDao);
        };
    }

    private void deleteCourse(AppDao appDao) {
        int id=11;

        appDao.deleteCourse(id);
    }

    private void updateCourse(AppDao appDao) {
        int id=10;

        //find course
        Course tempCourse = appDao.findCourseById(id);

        //change data for course
        tempCourse.setTitle("Learn playing the guitar");

        //update course
        appDao.update(tempCourse);
    }

    private void updateInstructor(AppDao appDao) {
        int id=1;
        Instructor tempInstructor = appDao.findInstructorById(id);

        //change instructor data
        tempInstructor.setLastName("Testing");

        appDao.update(tempInstructor);
    }

    private void findInstructorWithCoursesJoinFetch(AppDao appDao) {
        int id = 1;

        //find the instructor
        System.out.println("Finding instructor with id: " + id);
        Instructor instructor = appDao.findInstructorByIdJoinFetch(id);

        System.out.println("Instructor: " + instructor.toString());
        System.out.println("Associated courses: " + instructor.getCourses().toString());

        System.out.println("Done");
    }

    private void findCoursesWithInstructor(AppDao appDao) {
        int id=1;
        System.out.println("Finding instructor id: " + id);

        Instructor tempInstructor = appDao.findInstructorById(id);
        System.out.println("Instructor: " + tempInstructor);

        //Find courses for instructor with id...
        System.out.println("Finding courses for instructor id: " + id);
        List<Course> courseList = appDao.findCoursesByInstructorId(id);

        //associate the objects
        tempInstructor.setCourses(courseList);

        System.out.println("Courses: " + tempInstructor.getCourses());

    }

    private void findInstructorWithCourses(AppDao appDao) {
        int id=1;
        System.out.println("Finding instructor id: " + id);

        Instructor tempInstructor = appDao.findInstructorById(id);
        System.out.println("Instructor: " + tempInstructor);

        System.out.println("The associated courses: " + tempInstructor.getCourses());

        System.out.println("Done");
    }

    private void createInstructorWithCourses(AppDao appDao) {
        Instructor instructor = new Instructor("Robert", "Dubs", "robert@gmail.com");

        InstructorDetails instructorDetails = new InstructorDetails("youtube.com/robert", "Skiing");

        instructor.setInstructorDetails(instructorDetails);

        Course course1 = new Course("Learn Spring Boot");
        Course course2 = new Course("Learn Java");
        Course course3 = new Course("Learn Python");

        instructor.add(course1);
        instructor.add(course2);
        instructor.add(course3);

        System.out.println("Saving instructor: " + instructor.toString());
        System.out.println("The courses: " + instructor.getCourses());

        //this will also save the course because of CascadeType.PERSIST
        appDao.save(instructor);

        System.out.println("Done");
    }

    private void deleteInstructorDetails(AppDao appDao) {
        int id=6;

        System.out.println("Deleting instructor with id: " + id);
        appDao.deleteInstructorDetailsById(id);
        System.out.println("Done");
    }

    private void findInstructorDetails(AppDao appDao) {
        int id=3;
        InstructorDetails instructorDetails = appDao.findInstructorDetailsById(id);

        System.out.println("InstructorDetails info: " + instructorDetails.toString());
        System.out.println("Associated Instructor info" + instructorDetails.getInstructor().toString());
    }

    private void deleteInstructor(AppDao appDao) {
        int id=1;

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
