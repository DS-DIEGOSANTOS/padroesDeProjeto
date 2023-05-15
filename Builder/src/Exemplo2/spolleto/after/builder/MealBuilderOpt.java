package Exemplo2.spolleto.after.builder;

import Exemplo2.spolleto.after.model.Meal.Meal;
import Exemplo2.spolleto.after.model.Meal.Pasta;
import Exemplo2.spolleto.after.model.Size;

import java.util.List;

public abstract class MealBuilderOpt {
	protected Size size;
	protected List<String> toppings;
	protected List<String> sauces;
	protected boolean cheese;
	protected boolean pepper;

	public void setSize(Size size) {
		this.size = size;
	}

	public void setSauce(List<String> sauces) {
		this.sauces = sauces;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public void setPepper(boolean pepper) {
		this.pepper = pepper;
	}

	public abstract Meal getResult();
}
