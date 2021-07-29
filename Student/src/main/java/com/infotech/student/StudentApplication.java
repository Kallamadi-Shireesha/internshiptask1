package com.infotech.student;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.infotech.student.entities.Student;
import com.infotech.student.service.StudentService;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext applicationContext=SpringApplication.run(StudentApplication.class, args);
	 StudentService studentService=applicationContext.getBean("studentService",StudentService.class);

	Student student = new Student();
	student.setClassid(1);
	student.setName("siri");
	student.setLocation("Pune");	
	studentService.createStudent(student);
	
	Student student1 = new Student();
	student1.setClassid(2);
	student1.setName("ani");
	student1.setLocation("kaki");
	studentService.createStudent(student1);
	
	
	Student student2 = new Student();
	student2.setClassid(3);
	student2.setName("ani");
	student2.setLocation("delhi");	
	studentService.createStudent(student2);
	
	Student student3 = new Student();
	student3.setClassid(4);
	student3.setName("ani");
	student3.setLocation("bang");	
	studentService.createStudent(student3);
	
	Student student4 = new Student();
	student4.setClassid(5);
	student4.setName("ani");
	student4.setLocation("hyd");	
	studentService.createStudent(student4);
	
	
	Student student5 = new Student();
	student5.setClassid(6);
	student5.setName("ani");
	student5.setLocation("atp");	
	studentService.createStudent(student5);
}
}