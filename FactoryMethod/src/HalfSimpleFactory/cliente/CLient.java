package HalfSimpleFactory.cliente;

import HalfSimpleFactory.Factory.Iphone11Factory;
import HalfSimpleFactory.Factory.IphoneFactory;
import HalfSimpleFactory.Factory.IphoneXFactory;
import Model.Iphone;

public class CLient {

    public static void main(String[] args) {
        IphoneFactory genXFactory = new IphoneXFactory();
        IphoneFactory gen11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = genXFactory.getIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = gen11Factory.getIPhone("highEnd");
        System.out.println(iphone2);
    }
}
