package ComFactory.Factory;

import Model.Iphone;
import Model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    protected Iphone createIPhone() {
        return new Iphone11Pro();
    }
}
