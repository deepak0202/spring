package com.bridgeit.dao;

import com.bridgeit.pojo.Student;

public interface StudentDAO {
	public void insert(Student student);

	public Student getByEmail(String email);
	
	boolean loginValidation(String email,String password);
}
