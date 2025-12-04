package com.nk.studentmanagementsystem.controller;

import com.nk.studentmanagementsystem.beans.Student;
import com.nk.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestParam("sid") int sid,@RequestParam("sname") String sname,@RequestParam("saddr") String saddr,@RequestParam("sphone") long sphone, ModelMap model) {
        Student student = new Student();
        student.setSid(sid);
        student.setSname(sname);
        student.setSaddr(saddr);
        student.setSphone(sphone);
        String status = service.addStudent(student);
        if (status.equalsIgnoreCase("SUCCESS")) {
            model.addAttribute("message","Student Inserted Successfully");
        } else if (status.equalsIgnoreCase("EXISTS")) {
            model.addAttribute("message","Student Already Exists");
        }else {
            model.addAttribute("message","Student Insertion Failed");
        }
        return "status";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String  search(@RequestParam("sid") int sid,ModelMap model) {
        Student student = service.searchStudent(sid);
        if (student != null) {
            model.addAttribute("student",student);
            return "studentdetails";
        }else {
            model.addAttribute("message","Student Not Found");
            return "status";
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(
            @RequestParam("sid") int sid,
            @RequestParam("sname") String sname,
            @RequestParam("saddr") String saddr,
            @RequestParam("sphone") long sphone, ModelMap model) {
        Student student = new Student();
        student.setSid(sid);
        student.setSname(sname);
        student.setSaddr(saddr);
        student.setSphone(sphone);
        String result=service.updateStudent(student);
        if (result.equalsIgnoreCase("SUCCESS")) {
            model.addAttribute("message","Student Updated Successfully");
        }else if (result.equalsIgnoreCase("NOT FOUND")) {
            model.addAttribute("message","Student Is Not Found");
        }else {
            model.addAttribute("message","Student Update Failed");
        }
        return "status";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(@RequestParam("sid") int sid,ModelMap model) {
        String result=service.deleteStudent(sid);
        if (result.equalsIgnoreCase("SUCCESS")) {
            model.addAttribute("message","Student Deleted Successfully");
        }else if (result.equalsIgnoreCase("NOT FOUND")) {
            model.addAttribute("message","Student Is Not Found");
        }else {
            model.addAttribute("message","Student Deletion Failed");
        }
        return "status";
    }

    @RequestMapping(value = "/editform", method = RequestMethod.POST)
    public String editform(@RequestParam("sid") int sid,ModelMap model){
        Student student = service.searchStudent(sid);
        if (student == null) {
            model.addAttribute("message","Student Not Found");
            return "status";
        }else{
            model.addAttribute("student",student);
            return "editform";
        }
    }
}
