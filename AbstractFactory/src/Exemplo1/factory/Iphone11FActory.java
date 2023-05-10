package Exemplo1.factory;

import Exemplo1.abstractFactory.CountryRulesAbstractFactory;
import Exemplo1.model.Iphone.Iphone;
import Exemplo1.model.Iphone.Iphone11;
import Exemplo1.model.Iphone.Iphone11Pro;

public class Iphone11FActory extends IphoneFactory{
    public Iphone11FActory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public Iphone createIPhone(String level) {
        if(level.equals("standard")) {
            return new Iphone11(rules);
        } else if(level.equals("highEnd")) {
            return new Iphone11Pro(rules);
        } else return null;
    }

}
