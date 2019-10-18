package com.db1group.uemworkshop.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db1group.uemworkshop.domain.Post;
import com.db1group.uemworkshop.domain.Student;
import com.db1group.uemworkshop.service.PostService;
import com.db1group.uemworkshop.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	@Qualifier("MeuServiceBonitinho")
	private StudentService studentService;
	@Autowired
	private PostService postService;
	
	@GetMapping("/api/student")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/api/student")
	public void saveStudents(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}
	
	@GetMapping("/api/student/{id}")
	public Optional<Student> saveStudents(@PathVariable("id") UUID id) {
		return studentService.findById(id);
	}
	
	@GetMapping("/api/post/{id}")
	public Post getPostById(@PathVariable("id") Integer id) {
		return postService.findById(id);
	}

}
