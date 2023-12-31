package com.example.lab07_Exercise2;

import com.example.lab07_Exercise2.model.Student;
import com.example.lab07_Exercise2.service.interfaceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab07Application implements CommandLineRunner {
	@Autowired
	private interfaceStudent studentService;
	public static void main(String[] args) {
		SpringApplication.run(Lab07Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Preann Mesa", 21, "studentOne@gmail.com", 6.0);
		Student student2 = new Student("Phao Rothana", 22, "studentTwo@gmail.com", 6.5);
		Student student3 = new Student("Kim SengThai", 20, "studentThree@gmail.com", 7.0);
		this.studentService.insertStudent(student1);
		this.studentService.insertStudent(student2);
		this.studentService.insertStudent(student3);
		showStudents();
		System.out.println("After update students");
		student1.setIelts(8.0);
		this.studentService.updateStudent(student1.getId(), student1);
		showStudents();
		System.out.println("After delete student");
		this.studentService.deleteStudentById(student1.getId());
		showStudents();
	}

	private void showStudents() {
		Iterable<Student> students = studentService.getStudentAll();
		students.forEach(System.out::println);
	}
}
