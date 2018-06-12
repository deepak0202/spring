package spring.core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogDriver 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		ApplicationContext c = new ClassPathXmlApplicationContext("bean1.xml");
		System.out.println(2);
		DogPojo p1 = (DogPojo) c.getBean("s1");
		System.out.println(p1.getName());
		System.out.println(p1.getColour());
		
	}

}
