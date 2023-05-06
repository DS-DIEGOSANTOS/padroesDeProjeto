package HalfSimpleFactory.Factory;

import Model.Iphone;
import Model.Iphone11;
import Model.Iphone11Pro;

public class Iphone11Factory extends  IphoneFactory{
    @Override
    protected Iphone createIPhone(String tipo) {
        if(tipo.equals("standard")) {
            return new Iphone11();
        } else if(tipo.equals("highEnd")) {
            return new Iphone11Pro();
        } else return null;
    }
}
