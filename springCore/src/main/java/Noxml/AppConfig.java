package Noxml;

import org.springframework.context.annotation.Bean;

public class AppConfig 
{
	@Bean(name="obj")// here obj is like bean id
	public Person getPerson()
	{
		Person p1 = new Person();
		p1.setFirstName("abc");
		p1.setLastName("xyz");
		return p1;
	}
}                    
