package com.shivanshu.Spring_data_JPA;

import com.shivanshu.Spring_data_JPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);
}
