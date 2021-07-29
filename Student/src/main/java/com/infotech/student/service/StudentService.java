package com.infotech.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.infotech.student.dao.Studentdao;
import com.infotech.student.entities.Student;
@Service
public class StudentService implements IStudentService{

	@Autowired
	private Studentdao studentDao;
	
	public Student createStudent(Student student) {
		return studentDao.save(student);
	}

	public Optional<Student> getClassid(Integer classid) {
		return studentDao.findById(classid);
	}

	public Iterable<Student> getAllStudents() {
		return studentDao.findAll();
	}

	

	@Override
	public List<Student> findPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable paging= PageRequest.of(pageNo,pageSize);
		Page<Student> pageResult=studentDao.findAll(paging);
		return pageResult.toList();
	}

	

	

	


	
	
	

}
