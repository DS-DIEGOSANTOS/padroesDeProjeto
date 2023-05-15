package ComFactory.Factory;

import ComFactory.Model.Iphone;

public abstract class IphoneFactory {

    public Iphone getIPhone(String cor, Boolean comMemoria) {
        Iphone device = null;

        device = createIPhone(cor,comMemoria);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        System.out.println(device.getCor());
        System.out.println(device.getComMemoriaExtra());


        return device;
    }

    protected abstract Iphone createIPhone(String cor, Boolean comMemoria);
}
