package com.bridgeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.pojo.Student;

public class StudentDAOImpl implements StudentDAO {

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}
	@Override
	public void insert(Student student) {

		String query = "insert into student values(?,?,?,?,?,?)";

		JdbcTemplate template = new JdbcTemplate(dataSource);

		Object[] args = { student.getFirstName(), student.getLastName(), student.getEmail(), student.getPassword(),
				student.getMobileNumber(), student.getAge() };

		int result = template.update(query, args);

		if (result != 0) {
			System.out.println("Student inserted successfully with firstName : " + student.getFirstName());
		} else {
			System.out.println("Error in inserting the student with firstName : " + student.getFirstName());
		}
	}

	@Override
	public Student getByEmail(String email) {
		
		String query = "select * from student where email = ?";
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		Student student = template.queryForObject(query, new Object[] {email}, new RowMapper<Student>() 
		{
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Student student = new Student();
				student.setFirstName(rs.getString("firstName"));
				student.setLastName(rs.getString("lastName"));
				student.setEmail(rs.getString("email"));
				student.setPassword(rs.getString("password"));
				student.setMobileNumber(rs.getLong("mobileNumber"));
				student.setAge(rs.getInt("age"));
				return student;
			}
		});

		return student;
	}
	@Override
	public boolean loginValidation(String email, String password) 
	{
		System.out.println("deepak");
	 String sql="select password from student where email=?";
	 
	 JdbcTemplate template =new JdbcTemplate(dataSource);
	 String result=template.queryForObject(sql, new Object[]{email}, String.class);
	
	 System.out.println("result : "+result);
	 
	 if(result.equals(password))
	 {
	  return true;	 
	 }
	 else 
	 {
	  return false;	
	}
	
	}
	

}
