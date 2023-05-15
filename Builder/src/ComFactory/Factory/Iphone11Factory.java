package ComFactory.Factory;

import ComFactory.Model.Iphone;
import ComFactory.Model.Iphone11;

public class Iphone11Factory extends  IphoneFactory {
    @Override
    protected Iphone createIPhone(String cor, Boolean comMemoria) {
        return new Iphone11(cor,comMemoria);
    }
}
