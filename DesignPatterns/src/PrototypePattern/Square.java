package PrototypePattern;

public class Square extends Shape{


	private String type;
	public Square()
	{
		type = "Square";
	}
	@Override
	public void draw() {
       System.out.println("Inside Square");		
	}

}
