package Exemplo2;

import Exemplo2.abstractFactory.EJBAbstractFactory;
import Exemplo2.abstractFactory.ServicesAbstractFactory;
import Exemplo2.model.car.Car;
import Exemplo2.model.user.User;

public class Client {
    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        User userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        Car carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
