package com.db1group.uemworkshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.db1group.uemworkshop.domain.Student;

@Service(value = "MeuServiceBonitinho")
public class StudentService {

	private static final List<Student> students = new ArrayList<>();

	public List<Student> getAllStudents() {
		return students;
	}

	public void addNewStudent(Student student) {
		students.add(student);
	}

	public Optional<Student> findById(UUID id) {
		return students.stream()
				.filter(s -> s.getId().equals(id))
				.findFirst();
	}
	
}
