package ComFactoryAndDirector.builder;


import ComFactoryAndDirector.Model.Iphone;

public class IphoneGeral implements IphoneBuilder {
    private  Iphone iphone;

    public IphoneGeral(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void BuilderCor() {
        this.iphone.setCor("preta");
    }

    @Override
    public void BuilderComMemoria() {
        this.iphone.setComMemoriaExtra(false);
    }

    @Override
    public Iphone get() {
        return iphone;
    }
}
