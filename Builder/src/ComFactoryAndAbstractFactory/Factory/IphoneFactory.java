package ComFactoryAndAbstractFactory.Factory;


import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;
import ComFactoryAndAbstractFactory.model.iphone.Iphone;

public abstract class IphoneFactory {

    public Iphone getIPhone(String cor, Boolean comMemoria, CountryRulesAbstractFactory rulesAbstractFactory) {
        Iphone device = null;

        device = createIPhone(cor,comMemoria, rulesAbstractFactory);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        System.out.println(device.getCor());
        System.out.println(device.getComMemoriaExtra());


        return device;
    }

    protected abstract Iphone createIPhone(String cor, Boolean comMemoria, CountryRulesAbstractFactory rulesAbstractFactory);
}
