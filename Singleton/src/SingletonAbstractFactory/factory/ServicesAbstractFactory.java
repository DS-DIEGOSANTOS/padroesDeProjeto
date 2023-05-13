package SingletonAbstractFactory.factory;

import SingletonAbstractFactory.model.car.CarService;
import SingletonAbstractFactory.model.user.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
