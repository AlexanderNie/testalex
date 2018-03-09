package com.welearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.welearn.entity.Student;  

@Controller  
public class HelloWorldController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)  
    public ModelAndView helloWorld() {  
        String message = "HELLO SPRING MVC HOW R U";  
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "alex", 28));
        students.add(new Student(2, "bob", 31));
        ModelAndView m = new ModelAndView();
        m.addObject("students", students);
        m.addObject("message", message);
        return m;  
    }  

}
