package Exemplo2.spolleto.after.builder;

import Exemplo2.spolleto.after.model.Meal.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
