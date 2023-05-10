package Exemplo2.abstractFactory;

import Exemplo2.model.car.Car;
import Exemplo2.model.car.CarEJB;
import Exemplo2.model.car.CarRestApi;
import Exemplo2.model.user.User;
import Exemplo2.model.user.UserEJB;
import Exemplo2.model.user.UserRest;

public class RestAbstractFactory implements  ServicesAbstractFactory{
    @Override
    public User getUserService() {
        return new UserRest();
    }

    @Override
    public Car getCarService() {
        return new CarRestApi();
    }
}
