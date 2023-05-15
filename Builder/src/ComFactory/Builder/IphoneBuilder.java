package ComFactory.Builder;

import ComFactory.Factory.IphoneFactory;
import ComFactory.Model.Iphone;

public class IphoneBuilder {

    String cor;
    Boolean comMemoriaExtra;

    public IphoneBuilder() {
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
        return iphoneFactory.getIPhone(cor,comMemoriaExtra);
    }

}
