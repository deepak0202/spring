package Lifecycle;

public class Employee 
{
	private String fName;
	private String lName;
	Employee()
	{
		System.out.println("Employee()");
	}
	public String getfName() 
	{
		return fName;
	}
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	public String getlName() 
	{
		return lName;
	}
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	
	public void init()
	{
		System.out.println("init()");
	}
	public void release()
	{
		System.out.println("realese method");
	}
}
