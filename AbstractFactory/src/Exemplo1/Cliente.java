package Exemplo1;

import Exemplo1.abstractFactory.BrazilianRulesAbstractFactory;
import Exemplo1.abstractFactory.CountryRulesAbstractFactory;
import Exemplo1.factory.Iphone11FActory;
import Exemplo1.factory.IphoneFactory;
import Exemplo1.factory.IphoneXFactory;
import Exemplo1.model.Iphone.Iphone;

public class Cliente {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IphoneFactory genXFactory = new IphoneXFactory(rules);
        IphoneFactory gen11Factory = new Iphone11FActory(rules);

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
