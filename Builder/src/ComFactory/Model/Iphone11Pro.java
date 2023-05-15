package ComFactory.Model;

public class Iphone11Pro  extends  Iphone{
    public Iphone11Pro(String cor, Boolean comMemoriaExtra) {
        super(cor, comMemoriaExtra);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
