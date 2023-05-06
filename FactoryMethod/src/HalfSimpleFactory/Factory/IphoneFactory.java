package HalfSimpleFactory.Factory;

import Model.Iphone;

public abstract class IphoneFactory {

    public Iphone getIPhone(String tipo) {
        Iphone device = null;

        device = createIPhone(tipo);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIPhone(String tipo);
}
