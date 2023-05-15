package ComFactory.cliente;

import ComFactory.Builder.IphoneBuilder;
import ComFactory.Factory.Iphone11Factory;
import ComFactory.Factory.Iphone11ProFactory;
import ComFactory.Factory.IphoneFactory;
import ComFactory.Model.Iphone;

public class Client {

    public static void main(String[] args) {
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();
        IphoneFactory iphone11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone 11");
        Iphone builder = new IphoneBuilder().andComMemoriaExtra(false).andCor("Branco").getIphone(iphone11Factory);
        System.out.println(builder);

        System.out.println("\n\n### Ordering an iPhone 11 Pro");
        Iphone iphone2 = new IphoneBuilder().andComMemoriaExtra(true).andCor("Preto").getIphone(iphone11ProFactory);
        System.out.println(iphone2);
    }
}
