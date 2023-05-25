package org.nlt;

import java.util.Date;

import org.nlt.model.Students;
import org.nlt.repo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrudApiExerciseApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ap = SpringApplication.run(CrudApiExerciseApplication.class, args);
		
//		StudentRepository studentRepo = ap.getBean(StudentRepository.class);
//		
//		Students student = new Students();
//		student.setName("Raju");
//		student.setAge(21);
//		student.setPhone(244343413);
//		student.setStatus(1);
//		student.setCreated(new Date());
//		student.setModified(new Date());
//		
//		studentRepo.save(student);
//		ap.close();
	}

}
