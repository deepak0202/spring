package com.bridgeit.springCore.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S3 
{
	public static void main(String[] args) 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("bean5.xml");
		Student p1 = (Student) c.getBean("s3");
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		Address add = p1.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		
	}

}
