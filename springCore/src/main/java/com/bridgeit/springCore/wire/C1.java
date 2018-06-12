package com.bridgeit.springCore.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C1 
{
	public static void main(String[] args) 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("bean5.xml");
		Customer p1 = (Customer) c.getBean("c1");
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
	
		
	}
}