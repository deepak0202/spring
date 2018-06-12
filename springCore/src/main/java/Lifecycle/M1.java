package Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext cpr = new ClassPathXmlApplicationContext("bean2.xml");
		System.out.println(1);
		Student s1 = (Student) cpr.getBean("st1");
		System.out.println(2);
		System.out.println(s1.getfName());
		System.out.println(3);
		System.out.println(s1.getlName());
		cpr.registerShutdownHook();// by destroy method will be called automatic by framework

		
	}

}
