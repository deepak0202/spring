package Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean
{

	public void afterPropertiesSet() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("after property set");
	}

	public void destroy() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("destory method");
	}
	
	
	private String fName;
	private String lName;
	public Student()
	{
		System.out.println("Student()");
	}
	
	public void setfName(String fName) {
          System.out.println("setfName");
		this.fName = fName;
	}
	
	public void setlName(String lName) {
		System.out.println("setlName");
		this.lName = lName;
	}
public String getlName() {
	return lName;
}	
public String getfName() {
	return fName;
}


}
