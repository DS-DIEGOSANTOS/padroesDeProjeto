package reflexionFactory;

import Model.Iphone;
import reflexionFactory.Factory.IphoneFactory;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("### Ordering an iPhone X");
        Iphone iphone =new IphoneFactory().getIphone("IphoneX");
        iphone.getHardware();

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 =new IphoneFactory().getIphone("Iphone11Pro");
        iphone2.getHardware();
    }
}
