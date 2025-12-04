package com.nk.studentmanagementsystem.service;

import com.nk.studentmanagementsystem.beans.Student;
import com.nk.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public String addStudent(Student student) {
        String status=repository.add(student);
        return status;
    }

    @Override
    public Student searchStudent(int sid) {
        Student student=repository.search(sid);
        return student;
    }

    @Override
    public String updateStudent(Student student) {
        String status=repository.update(student);
        return status;
    }

    @Override
    public String deleteStudent(int sid) {
        String status=repository.delete(sid);
        return status;
    }
}
