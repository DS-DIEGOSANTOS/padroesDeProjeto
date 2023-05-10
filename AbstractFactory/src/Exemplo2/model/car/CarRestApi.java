package Exemplo2.model.car;

public class CarRestApi implements Car{
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through Rest's interface");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " car through Rest's interface");
    }
}
