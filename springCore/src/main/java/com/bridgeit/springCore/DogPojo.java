package com.bridgeit.springCore;

public class DogPojo 
{
	private String name;
	private String breed;
	private String colour;
	private Integer age;
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public String getColour() {
		return colour;
	}
	public Integer getAge() {
		return age;
	}
	public DogPojo(String name,String colour,Integer age) 
	{
		this.name = name;
		this.colour = colour;
		this.age = age;
	}

}
