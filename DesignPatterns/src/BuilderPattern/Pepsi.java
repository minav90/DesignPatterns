package BuilderPattern;

public class Pepsi extends Drink{

	float price = (float) 5.4;
	@Override
	public String getItemName() {
		return "Pepsi";
	}

	@Override
	public float getPrice() {
		return price;
	}

}
