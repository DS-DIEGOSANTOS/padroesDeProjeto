package ComFactoryAndAbstractFactory;

import ComFactoryAndAbstractFactory.Builder.IphoneBuilder;
import ComFactoryAndAbstractFactory.Factory.Iphone11Factory;
import ComFactoryAndAbstractFactory.Factory.IphoneFactory;
import ComFactoryAndAbstractFactory.abstractFactory.BrazilianRulesAbstractFactory;
import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;
import ComFactoryAndAbstractFactory.model.iphone.Iphone;

public class Cliente {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IphoneFactory gen11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = new IphoneBuilder(rules).andCor("preta").getIphone(gen11Factory);
        System.out.println(iphone);

    }
}
