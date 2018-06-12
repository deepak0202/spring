package com.bridgeit.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonConDriver 
{
	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("bean.xml");
		System.out.println(1);
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		System.out.println(2);
		PersonConstructorInjectionPojo personPojo = (PersonConstructorInjectionPojo) beanFactory.getBean("p1");
		System.out.println(3);
		String firstName = personPojo.getFirstName();
		String lastName = personPojo.getLastName();
		Integer age = personPojo.getAge();
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		
	}

}
