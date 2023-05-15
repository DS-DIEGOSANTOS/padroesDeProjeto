package Exemplo2.spolleto.after.builder;

import Exemplo2.spolleto.after.model.Size;

import java.util.List;

public interface MealBuilder {

	void setSize(Size size);
	void setSauce(List<String> sauces);
	void setToppings(List<String> toppings);
	void setCheese(boolean cheese);
	void setPepper(boolean pepper);
}
