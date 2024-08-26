package com.data.serviceI;

import com.data.model.Student;

public interface StudentI {

	void saveStudent(Student s);

	void deleteData(int p);

	void updatedata(int p, String pname);

}
