package BuilderPattern;

public class NonVegBurger extends Burger{

	float price = (float) 25.5;
	
	@Override
	public String getItemName() {
		return "Chicken Burger";
	}

	@Override
	public float getPrice() {
		return price;
	}

}
