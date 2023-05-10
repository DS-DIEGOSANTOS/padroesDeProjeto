package Exemplo1.factory;

import Exemplo1.abstractFactory.CountryRulesAbstractFactory;
import Exemplo1.model.Iphone.Iphone;
import Exemplo1.model.Iphone.IphoneX;
import Exemplo1.model.Iphone.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory{
    public IphoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public Iphone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IphoneX(rules);
        } else if(level.equals("highEnd")) {
            return new IphoneXSMax(rules);
        } else return null;
    }

}
