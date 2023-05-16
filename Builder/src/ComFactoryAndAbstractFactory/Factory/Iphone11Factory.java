package ComFactoryAndAbstractFactory.Factory;

import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;
import ComFactoryAndAbstractFactory.model.iphone.Iphone;
import ComFactoryAndAbstractFactory.model.iphone.Iphone11;

public class Iphone11Factory extends IphoneFactory {
    @Override
    protected Iphone createIPhone(String cor, Boolean comMemoria, CountryRulesAbstractFactory rulesAbstractFactory) {
        return new Iphone11(cor,comMemoria, rulesAbstractFactory);
    }
}
