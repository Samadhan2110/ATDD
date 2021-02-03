package com.samlab.practiceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samlab.practiceapp.model.Student;
import com.samlab.practiceapp.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired 
	StudentRepo studentRepos;
@PostMapping("/add/student/data")
public String insertStudent(@RequestBody Student student) {
	studentRepos.save(student);
	return "Your data is saved";
	
}
@GetMapping("/student/list")
public List<Student> getStudent() {
	return(List<Student>) studentRepos.findAll();
}
}
