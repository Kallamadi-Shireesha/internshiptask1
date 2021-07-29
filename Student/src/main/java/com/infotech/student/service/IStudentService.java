package com.infotech.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infotech.student.entities.Student;
@Service
public interface IStudentService {
	List<Student> findPaginated(int pageNo,int pageSize);

}
