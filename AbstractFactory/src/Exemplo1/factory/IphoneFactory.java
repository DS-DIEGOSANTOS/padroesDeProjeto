package Exemplo1.factory;

import Exemplo1.abstractFactory.CountryRulesAbstractFactory;
import Exemplo1.model.Iphone.Iphone;

public abstract class IphoneFactory {
    CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Iphone orderIPhone(String level) {
        Iphone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIPhone(String level);
}
