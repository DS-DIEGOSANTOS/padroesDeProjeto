package SingletonAbstractFactory;

import SingletonAbstractFactory.factory.EJBAbstractFactory;
import SingletonAbstractFactory.factory.ServicesAbstractFactory;
import SingletonAbstractFactory.model.car.CarService;
import SingletonAbstractFactory.model.user.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = EJBAbstractFactory.getInstance();
//		ServicesAbstractFactory factory = RestAbstractFactory().getInstance();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
