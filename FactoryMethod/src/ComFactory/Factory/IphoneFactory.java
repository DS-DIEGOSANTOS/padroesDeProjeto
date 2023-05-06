package ComFactory.Factory;

import Model.Iphone;

public abstract class IphoneFactory {

    public Iphone getIPhone() {
        Iphone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIPhone();
}
