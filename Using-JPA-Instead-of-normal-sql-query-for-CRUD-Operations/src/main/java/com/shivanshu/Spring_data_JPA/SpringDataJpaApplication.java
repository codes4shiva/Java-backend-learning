package com.shivanshu.Spring_data_JPA;

import com.shivanshu.Spring_data_JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		 Student s3 = context.getBean(Student.class);

		StudentRepo repo =   context.getBean(StudentRepo.class);

//		s1.setName("Shivanshu");
//		s1.setMarks(100);
//		s1.setRollNo(56);
//
//
		s2.setName("Saumya");
//		s2.setMarks(100);
		s2.setMarks(96); // Updating the marks of the already stored object
		s2.setRollNo(55);
//
		s3.setName("Sam");
		s3.setRollNo(96);
		s3.setMarks(55);

		// repo.save(s2); // updating the s2
		// repo.save(s3);  saved the s3 object
		repo.delete(s3); // deleting the object


		// System.out.println(repo.findByMarksGreaterThan(98));
	}

}
