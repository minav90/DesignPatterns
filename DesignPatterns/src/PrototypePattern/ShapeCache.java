package PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> map = new Hashtable<String, Shape>();

	public Shape getShape(String type) {
		Shape cachedShape = map.get(type);
		return (Shape) cachedShape.clone();
	}

	public void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		map.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		map.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		map.put(rectangle.getId(), rectangle);

	}

}
