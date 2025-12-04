package com.nk.studentmanagementsystem.repository;

import com.nk.studentmanagementsystem.beans.Student;

public interface StudentRepository {
    public String add(Student student);
    public Student search(int sid);
    public String update(Student student);
    public String delete(int sid);
}
