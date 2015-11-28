package PrototypePattern;

public class Rectangle extends Shape{


	private String type;
	public Rectangle()
	{
		type = "Rectangle";
	}
	@Override
	public void draw() {
         System.out.println("Inside Rectangle");		
	}

}
