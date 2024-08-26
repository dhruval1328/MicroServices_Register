package com.data.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.model.Student;
import com.data.repository.StudentRepo;
import com.data.serviceI.StudentI;

@Service
public class StudentImpl implements StudentI{

	@Autowired
	StudentRepo sr;
	
	@Override
	public void saveStudent(Student s) {
		sr.save(s);
		
	}

	@Override
	public void deleteData(int p) {
		sr.deleteById(p);
		
	}

	@Override
	public void updatedata(int p, String pname) {
		sr.updateDataByPath(p, pname);
		
	}

}
