package com.bridgeit.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DogDriver 
{
	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		DogPojo dogPojo = (DogPojo) beanFactory.getBean("d");
		String name = dogPojo.getName();
		String breed = dogPojo.getBreed();
		Integer age = dogPojo.getAge();
		String colour = dogPojo.getColour();
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(colour);
		
		
		
	}

}
