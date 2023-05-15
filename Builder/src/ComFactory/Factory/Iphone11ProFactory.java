package ComFactory.Factory;

import ComFactory.Model.Iphone;
import ComFactory.Model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    protected Iphone createIPhone(String cor, Boolean comMemoria) {
        return new Iphone11Pro(cor,comMemoria);
    }
}
