package BuilderPattern;

public class BuilderPatternDemo {
	   public static void main(String[] args) {
	   
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.getOrderDetails();
	      System.out.println("Total Cost: " + vegMeal.getAmount());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.getOrderDetails();
	      System.out.println("Total Cost: " + nonVegMeal.getAmount());
	   }
	}