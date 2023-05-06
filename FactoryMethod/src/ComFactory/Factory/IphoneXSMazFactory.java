package ComFactory.Factory;

import Model.Iphone;
import Model.IphoneXSMax;

public class IphoneXSMazFactory extends IphoneFactory{
    @Override
    protected Iphone createIPhone() {
        return new IphoneXSMax();
    }
}
