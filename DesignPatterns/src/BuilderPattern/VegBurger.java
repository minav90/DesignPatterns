package BuilderPattern;

public class VegBurger extends Burger{

	float price = (float) 9.5;
	
	@Override
	public String getItemName() {
		return "VegBurger";
	}
	@Override
	public float getPrice() {
		return price;
	} 
	
}
