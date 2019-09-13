package com.example.handlinglists.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.handlinglists.domain.Student;


@Controller
public class ListController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
	
		List<Student> students = new ArrayList<Student>();
	
		Student student = new Student("Kate", "Cole");
		students.add(student);
		student = new Student("Dan", "Brown");
		students.add(student);
		student = new Student("Mike", "Mars");
		students.add(student);
			
		 model.addAttribute("students", students);
		 return "hello";
	
	}
	
}
