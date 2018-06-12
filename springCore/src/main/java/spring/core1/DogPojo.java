package spring.core1;

public class DogPojo 
{
	private String colour;
	private String name;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		System.out.println("from set colour");
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("from set name");
		this.name = name;
	}
	
	public DogPojo(String colour,String name) 
	{
		this.name = name;
		this.colour = colour;
	}
	public DogPojo() {
		// TODO Auto-generated constructor stub
	}

}
