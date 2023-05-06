package SimpleFactory.Cliente;

import Model.Iphone;
import SimpleFactory.Factory.IphoneSimpleFactory;

public class cliente {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        Iphone iphone = IphoneSimpleFactory.getIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = IphoneSimpleFactory.getIPhone("11", "highEnd");
        System.out.println(iphone2);
    }
}
