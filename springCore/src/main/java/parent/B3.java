package parent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class B3 
{
	public static void main(String[] args) {
		
	
	ClassPathXmlApplicationContext cpr = new ClassPathXmlApplicationContext("bean4.xml");
	
	Book b1 =  (Book) cpr.getBean("b3");

	System.out.println(b1.getTitle());
	
	System.out.println(b1.getAuthor());
	System.out.println(b1.getPrice());
	}
}
