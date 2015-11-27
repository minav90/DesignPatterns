package BuilderPattern;

public abstract class Burger implements Item{

	abstract public String getItemName();

	abstract public float getPrice();

	@Override
	public Packaging getPackage() {

	    return new Wrapper();
	}

}
