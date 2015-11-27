package BuilderPattern;

public class Coke extends Drink{

	float price = (float) 6.4;
	
	@Override
	public String getItemName() {
		return "Coke";
	}

	@Override
	public float getPrice() {
		return price;
	}

}
