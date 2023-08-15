package com.unejsi.cruddemo.dao;

import com.unejsi.cruddemo.entity.Instructor;
import com.unejsi.cruddemo.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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


}
