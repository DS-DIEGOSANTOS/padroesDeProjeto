package SingletonAbstractFactory.factory;


import SingletonAbstractFactory.model.car.CarRestApiService;
import SingletonAbstractFactory.model.car.CarService;
import SingletonAbstractFactory.model.user.UserRestApiService;
import SingletonAbstractFactory.model.user.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {
	private static RestAbstractFactory factory;

	public static RestAbstractFactory getInstance() {
		if (factory == null) {
			factory = new RestAbstractFactory();
		}
		return factory;
	}

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
