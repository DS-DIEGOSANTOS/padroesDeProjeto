package ComFactoryAndAbstractFactory.Factory;


import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;
import ComFactoryAndAbstractFactory.model.iphone.Iphone;
import ComFactoryAndAbstractFactory.model.iphone.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory {
    @Override
    protected Iphone createIPhone(String cor, Boolean comMemoria, CountryRulesAbstractFactory rulesAbstractFactory) {
        return new Iphone11Pro(cor,comMemoria,rulesAbstractFactory);
    }
}
