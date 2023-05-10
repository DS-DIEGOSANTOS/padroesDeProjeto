package Exemplo2.abstractFactory;

import Exemplo2.model.car.Car;
import Exemplo2.model.user.User;

public interface ServicesAbstractFactory {
    User getUserService();

    Car getCarService();
}
