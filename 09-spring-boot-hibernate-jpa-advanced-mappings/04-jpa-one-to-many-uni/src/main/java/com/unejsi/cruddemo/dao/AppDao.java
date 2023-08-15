package com.unejsi.cruddemo.dao;

import com.unejsi.cruddemo.entity.Course;
import com.unejsi.cruddemo.entity.Instructor;
import com.unejsi.cruddemo.entity.InstructorDetails;

import java.util.List;

public interface AppDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetails findInstructorDetailsById(int id);

    void deleteInstructorDetailsById(int id);

    List<Course> findCoursesByInstructorId(int instructorId);

    Instructor findInstructorByIdJoinFetch(int id);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int courseId);

    void deleteCourseById(int courseId);

    void save(Course course);

    Course findCourseAndReviewsByCourseId(int courseId);

}
