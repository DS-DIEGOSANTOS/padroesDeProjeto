package ComFactoryAndAbstractFactory.Builder;


import ComFactoryAndAbstractFactory.Factory.IphoneFactory;
import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;
import ComFactoryAndAbstractFactory.model.iphone.Iphone;

public class IphoneBuilder {

    String cor;
    Boolean comMemoriaExtra;

    CountryRulesAbstractFactory rule;

    public IphoneBuilder(CountryRulesAbstractFactory rulesAbstractFactory) {
        rule = rulesAbstractFactory;
    }
    public IphoneBuilder andCor(String cor){
        this.cor =cor ;
        return this;
    }
    public IphoneBuilder andComMemoriaExtra(Boolean memoria ){
        this.comMemoriaExtra=  memoria;
        return  this;
    }

    public Iphone getIphone(IphoneFactory iphoneFactory){
        return iphoneFactory.getIPhone(cor,comMemoriaExtra, rule);
    }

}
