package ComFactory.cliente;

import ComFactory.Factory.Iphone11ProFactory;
import ComFactory.Factory.IphoneFactory;
import ComFactory.Factory.IphoneXFactory;
import Model.Iphone;

public class Client {

    public static void main(String[] args) {
        IphoneFactory iphoneXFactory = new IphoneXFactory();
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = iphoneXFactory.getIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = iphone11ProFactory.getIPhone();
        System.out.println(iphone2);
    }
}
