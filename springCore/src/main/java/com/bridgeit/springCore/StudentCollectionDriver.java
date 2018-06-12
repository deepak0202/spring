package com.bridgeit.springCore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentCollectionDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(cpr);
		StudentCollectoinPojo obj = (StudentCollectoinPojo) beanFactory.getBean("st1");
		String s1 = obj.getFirstName();
		int age = obj.getAge();
		double weight = obj.getWeight();
		int[] marks = obj.getMarks();
		String[] project = obj.getProject();
		List<Long> mobileNos =obj.getMobileNumber();
		Set<String> emailIds = obj.getEmailIds();
		Map<String, String>  educations = obj.getEducations();
		Properties skills = obj.getSkills();
		System.out.println(s1);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(project));
		System.out.println(mobileNos);
		System.out.println(emailIds);
		System.out.println(educations);
		System.out.println(skills);
		Address add = obj.getAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		System.out.println("done");	
	}
	
	

}
