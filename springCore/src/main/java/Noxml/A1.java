package Noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class A1 
{
	public static void main(String[] args) {
		
	
	ApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);// here use this for
	// config thogh java file
	Person p = (Person) c.getBean("obj");
	System.out.println(p.getFirstName());
	System.out.println(p.getLastName());
	}
}
