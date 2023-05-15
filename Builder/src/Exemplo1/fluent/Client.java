package Exemplo1.fluent;

import Exemplo1.fluent.builder.FastFoodMealBuilder;
import Exemplo1.fluent.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.build();
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").build();
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.build();
		System.out.println(heartAtackCombo);
	}
}
