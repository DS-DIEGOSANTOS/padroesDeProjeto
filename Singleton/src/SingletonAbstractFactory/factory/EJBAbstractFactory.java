package SingletonAbstractFactory.factory;

import SingletonAbstractFactory.model.car.CarEJBService;
import SingletonAbstractFactory.model.car.CarService;
import SingletonAbstractFactory.model.user.UserEJBService;
import SingletonAbstractFactory.model.user.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {
	private static EJBAbstractFactory factory;

	public static EJBAbstractFactory getInstance() {
		if (factory == null) {
			factory = new EJBAbstractFactory();
		}
		return factory;
	}

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



