package SimpleFactory.Factory;

import Model.*;

public class IphoneSimpleFactory {

    public static Iphone getIPhone(String generation, String level) {
        Iphone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IphoneX();
            } else if (level.equals("highEnd")) {
                device = new IphoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new Iphone11();
            } else if (level.equals("highEnd")) {
                device = new Iphone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
