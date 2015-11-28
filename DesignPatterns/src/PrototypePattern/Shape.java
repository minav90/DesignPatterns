package PrototypePattern;

public abstract class Shape implements Cloneable {

	private String type;
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			System.out.println("Error in creating Object");
		}

		return clone;

	}
	
	abstract public void draw();

}
