package Exemplo2.spolleto.after.builder;

import Exemplo2.spolleto.after.model.Meal.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
