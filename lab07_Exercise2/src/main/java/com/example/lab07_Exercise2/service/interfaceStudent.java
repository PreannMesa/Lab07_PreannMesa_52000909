package com.example.lab07_Exercise2.service;
import com.example.lab07_Exercise2.model.Student;
public interface interfaceStudent {
    public Iterable<Student> getStudentAll();
    public Student getStudentById(int id);
    public Student insertStudent(Student student);
    public boolean deleteStudent(Student student);
    public boolean deleteStudentById(int id);
    public Student updateStudent(int id, Student student);
}
