package Exemplo2.model.user;

public class UserRest implements User {
    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through Rest's interface");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through Rest's interface");
        return true;
    }
}
