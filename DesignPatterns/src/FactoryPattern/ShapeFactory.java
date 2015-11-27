package FactoryPattern;

public class ShapeFactory {
	
	public ShapeFactory() {
	}
	
	public Shape getShape(String type)
	{
		switch (type) {
		case "Circle":
			
			return new Circle(); 

		case "Rectangle":
			 
			return new Rectangle();
			
	    default:
			
            return new Square();
		}
	}
	

}
