package Exemplo2.abstractFactory;

import Exemplo2.model.car.Car;
import Exemplo2.model.car.CarEJB;
import Exemplo2.model.user.User;
import Exemplo2.model.user.UserEJB;

public class EJBAbstractFactory implements  ServicesAbstractFactory{
    @Override
    public User getUserService() {
        return new UserEJB();
    }

    @Override
    public Car getCarService() {
        return new CarEJB();
    }
}
