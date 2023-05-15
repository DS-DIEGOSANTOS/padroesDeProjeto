package ComFactoryAndDirector.Factory;

import ComFactoryAndDirector.Model.Iphone;
import ComFactoryAndDirector.Model.Iphone11Pro;
import ComFactoryAndDirector.builder.IphoneGeral;
import ComFactoryAndDirector.director.IphoneDirector;

public class Iphone11ProFactory extends IphoneFactory {
    protected Iphone createIPhone() {
        IphoneDirector director = new IphoneDirector(new IphoneGeral(new Iphone11Pro()));
        director.constructIphone();
        return director.getIphone();
    }
}
