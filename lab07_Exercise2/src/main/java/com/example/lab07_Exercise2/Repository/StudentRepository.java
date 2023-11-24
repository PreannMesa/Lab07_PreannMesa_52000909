package com.example.lab07_Exercise2.Repository;

import com.example.lab07_Exercise2.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository <Student, Integer> {

}
