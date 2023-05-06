package SemFactory;

import Model.*;

public class Client {

    public Iphone getIPhone(String generation, String level) {
        Iphone device = null;

        if(generation.equals("X")) {
            if(level.equals("standard")) {
                device = new IphoneX();
            } else if(level.equals("highEnd")) {
                device = new IphoneXSMax();
            }
        } else if(generation.equals("11")) {
            if(level.equals("standard")) {
                device = new Iphone11();
            } else if(level.equals("highEnd")) {
                device = new Iphone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = client.getIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = client.getIPhone("11", "highEnd");
        System.out.println(iphone2);
    }
}
