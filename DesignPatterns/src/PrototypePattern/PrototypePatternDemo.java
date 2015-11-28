package PrototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();
        
        Shape clonedCircle = shapeCache.getShape("1");
        clonedCircle.draw();
        
        Shape rectangleCircle = shapeCache.getShape("3");
        rectangleCircle.draw();
        
        Shape squareCircle = shapeCache.getShape("2");
        squareCircle.draw();
	}
	
}
