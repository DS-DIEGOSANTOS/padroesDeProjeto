package ComFactoryAndDirector.cliente;


import ComFactoryAndDirector.Factory.Iphone11Factory;
import ComFactoryAndDirector.Factory.Iphone11ProFactory;
import ComFactoryAndDirector.Factory.IphoneFactory;
import ComFactoryAndDirector.Model.Iphone;

public class Client {

    public static void main(String[] args) {
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();
        IphoneFactory iphone11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone 11");
        Iphone builder =iphone11ProFactory.getIPhone();
        System.out.println(builder);

        System.out.println("\n\n### Ordering an iPhone 11 Pro");
        Iphone iphone2 = iphone11Factory.getIPhone();
        System.out.println(iphone2);
    }
}
