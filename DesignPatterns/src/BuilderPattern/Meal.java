package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	float amount;
	List<Item> items = new ArrayList<Item>();

	public void addItems(Item item) {
		amount += item.getPrice();
		items.add(item);
	}

	public void getOrderDetails() {
		for (Item item : items) {
			System.out.print("Item : " + item.getItemName());
			System.out.print(", Packing : " + item.getPackage().pack());
			System.out.println(", Price : " + item.getPrice());
		}
	}

	public float getAmount() {
		return amount;
	}

}
