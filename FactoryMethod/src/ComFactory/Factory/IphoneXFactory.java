package ComFactory.Factory;

import Model.Iphone;
import Model.IphoneX;

public class IphoneXFactory extends  IphoneFactory{
    @Override
    protected Iphone createIPhone() {
        return new IphoneX();
    }
}
