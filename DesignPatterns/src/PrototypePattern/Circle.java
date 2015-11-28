package PrototypePattern;

public class Circle extends Shape{
	
	private String type;
	public Circle()
	{
		type = "Circle";
	}
	@Override
	public void draw() {
         System.out.println("Inside Circle");		
	}
	
	

}
