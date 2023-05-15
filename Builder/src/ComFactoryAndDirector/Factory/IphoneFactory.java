package ComFactoryAndDirector.Factory;


import ComFactoryAndDirector.Model.Iphone;

public abstract class IphoneFactory {

    public Iphone getIPhone() {
        Iphone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        System.out.println(device.getCor());
        System.out.println(device.getComMemoriaExtra());


        return device;
    }

    protected abstract Iphone createIPhone();
}
