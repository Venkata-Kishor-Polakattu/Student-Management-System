package com.nk.studentmanagementsystem.repository;

import com.nk.studentmanagementsystem.beans.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager  entityManager;

    @Transactional
    @Override
    public String add(Student student) {
        String status="";
        try{
            Student std=entityManager.find(Student.class,student.getSid());
            if(std==null){
                entityManager.persist(student);
                status="SUCCESS";
            }else{
                status="EXISTS";
            }
        }catch(Exception e){
            status="FAILURE";
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Student search(int sid) {
        Student student=null;
        try {
            student = entityManager.find(Student.class, sid);
        }catch(Exception e){
            e.printStackTrace();
        }
        return student;
    }

    @Transactional
    @Override
    public String update(Student student) {
        String status="";
        try {
            Student std = entityManager.find(Student.class, student.getSid());
            if(std==null){
                status="NOT FOUND";
            }else{
                std.setSname(student.getSname());
                std.setSaddr(student.getSaddr());
                std.setSphone(student.getSphone());
                status="SUCCESS";
            }
        }catch (Exception e){
            status="FAILURE";
            e.printStackTrace();
        }
        return status;
    }

    @Transactional
    @Override
    public String delete(int sid) {
        String result="";
        try{
            Student std=entityManager.find(Student.class, sid);
            if(std==null){
                result="NOT FOUND";
            }else {
                entityManager.remove(std);
                result="SUCCESS";
            }
        }catch (Exception e){
            result="FAILURE";
            e.printStackTrace();
        }
        return result;
    }
}
