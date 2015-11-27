package BuilderPattern;

public abstract class Drink implements Item {

    abstract public String getItemName();

	abstract public float getPrice();

	@Override
	public Packaging getPackage() {

	    return new Bottle();
	}

}
