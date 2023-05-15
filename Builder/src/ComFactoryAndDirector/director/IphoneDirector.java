package ComFactoryAndDirector.director;

import ComFactoryAndDirector.Model.Iphone;
import ComFactoryAndDirector.builder.IphoneBuilder;

public class IphoneDirector {
    private IphoneBuilder builder;

    public IphoneDirector(IphoneBuilder builder) {
        this.builder = builder;
    }

    public void constructIphone() {
        builder.BuilderCor();
        builder.BuilderComMemoria();

    }

    public Iphone getIphone() {
        return builder.get();
    }
}
