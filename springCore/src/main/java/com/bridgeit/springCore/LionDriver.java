package com.bridgeit.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LionDriver {
public static void main(String[] args) 
{

	Resource resource = new ClassPathResource("bean.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	LionConIndexPojo lionConIndexPojo = (LionConIndexPojo) beanFactory.getBean("l");
	String name = lionConIndexPojo.getName();
	String colour = lionConIndexPojo.getColour();
	Integer age = lionConIndexPojo.getAge();
	System.out.println(name);
	System.out.println(colour);
	System.out.println(age);
	//by constroter injection we can pass dublicate value also
	//previous value will get override
}
}
