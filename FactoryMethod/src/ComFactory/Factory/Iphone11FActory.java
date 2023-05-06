package ComFactory.Factory;

import Model.Iphone;
import Model.Iphone11;

public class Iphone11FActory extends  IphoneFactory {
    @Override
    protected Iphone createIPhone() {
        return new Iphone11();
    }
}
