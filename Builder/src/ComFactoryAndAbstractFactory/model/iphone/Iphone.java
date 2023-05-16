package ComFactoryAndAbstractFactory.model.iphone;

import ComFactoryAndAbstractFactory.abstractFactory.CountryRulesAbstractFactory;

public abstract class Iphone {
    String cor;
    Boolean comMemoriaExtra;
    CountryRulesAbstractFactory rules;

    public Iphone(String cor, Boolean comMemoriaExtra, CountryRulesAbstractFactory rules) {
        this.cor = cor;
        this.comMemoriaExtra = comMemoriaExtra;
        this.rules = rules;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getComMemoriaExtra() {
        return comMemoriaExtra;
    }

    public void setComMemoriaExtra(Boolean comMemoriaExtra) {
        this.comMemoriaExtra = comMemoriaExtra;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }
}
