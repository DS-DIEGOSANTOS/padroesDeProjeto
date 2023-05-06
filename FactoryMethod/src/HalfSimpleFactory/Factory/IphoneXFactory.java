package HalfSimpleFactory.Factory;

import Model.Iphone;
import Model.IphoneX;
import Model.IphoneXSMax;

public class IphoneXFactory  extends  IphoneFactory{
    @Override
    protected Iphone createIPhone(String tipo) {
        if(tipo.equals("standard")) {
            return new IphoneX();
        } else if(tipo.equals("highEnd")) {
            return new IphoneXSMax();
        } else return null;
    }
}
