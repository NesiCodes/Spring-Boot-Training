package com.unejsi.cruddemo.dao;

import com.unejsi.cruddemo.entity.Course;
import com.unejsi.cruddemo.entity.Instructor;
import com.unejsi.cruddemo.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppDaoImpl implements AppDao{

    private EntityManager entityManager;

    @Autowired
    public AppDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor tempInstructor = entityManager.find(Instructor.class, id);

        List<Course> courseList = tempInstructor.getCourses();

        //break association
        for(Course tempCourse: courseList){
            tempCourse.setInstructor(null);
        }

        entityManager.remove(tempInstructor);
    }

    @Override
    public InstructorDetails findInstructorDetailsById(int id) {
        InstructorDetails instructorDetails = entityManager.find(InstructorDetails.class, id);
        return instructorDetails;
    }

    @Override
    @Transactional
    public void deleteInstructorDetailsById(int id) {
        InstructorDetails tempInstructorDetails = entityManager.find(InstructorDetails.class, id);

        //remove the associated object reference
        //break the bi-directional link
        tempInstructorDetails.getInstructor().setInstructorDetails(null);

        entityManager.remove(tempInstructorDetails);
    }

    @Override
    public List<Course> findCoursesByInstructorId(int instructorId) {

        //create query
        TypedQuery<Course> courseTypedQuery = entityManager.createQuery("from Course where instructor.id=:data", Course.class);
        courseTypedQuery.setParameter("data", instructorId);

        //execute query
        List<Course> courseList = courseTypedQuery.getResultList();

        return courseList;
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int id) {
        //create query
        TypedQuery<Instructor> query = entityManager.createQuery("select i from Instructor i "
                                                                    + "JOIN FETCH i.courses "
                                                                    + "JOIN FETCH i.instructorDetails "
                                                                    + "where i.id = :data", Instructor.class);

        query.setParameter("data", id);
        //execute query
        Instructor tempInstructor = query.getSingleResult();

        return tempInstructor;
    }

    @Override
    @Transactional
    public void update(Instructor tempInstructor) {
        entityManager.merge(tempInstructor);
    }

    @Override
    @Transactional
    public void update(Course tempCourse) {
        entityManager.merge(tempCourse);
    }

    @Override
    public Course findCourseById(int courseId) {
        return entityManager.find(Course.class,courseId);
    }

    @Override
    @Transactional
    public void deleteCourseById(int courseId) {
        // retrieve the course
        Course tempCourse = entityManager.find(Course.class, courseId);

        // delete the course
        entityManager.remove(tempCourse);
    }

    @Override
    @Transactional
    public void save(Course course) {
        entityManager.persist(course);
    }

    @Override
    public Course findCourseAndReviewsByCourseId(int courseId) {
        TypedQuery<Course> query = entityManager.createQuery("SELECT c from Course c "
                                                                + "JOIN FETCH c.reviews "
                                                                + "where c.id = :data", Course.class);

        query.setParameter("data", courseId);

        Course tempCourse = query.getSingleResult();

        return tempCourse;
    }


}
