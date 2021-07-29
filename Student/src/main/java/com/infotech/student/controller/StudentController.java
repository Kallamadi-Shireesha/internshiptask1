package com.infotech.student.controller;

import com.infotech.student.entities.Student;
import com.infotech.student.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/create")
	public Student createStudent(@RequestBody Student student){
		return studentService.createStudent(student);
	}
	
	
	@GetMapping(value="/student/allstudents")
	public Iterable<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@GetMapping(value="/student/{pageNo}/{pageSize}")
	
	public List<Student> getPaginated(@PathVariable int pageNo, @PathVariable int pageSize){
		return studentService.findPaginated(pageNo, pageSize);
		
	}
	
}