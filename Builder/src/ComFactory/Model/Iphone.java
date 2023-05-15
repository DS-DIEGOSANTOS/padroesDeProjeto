package ComFactory.Model;

public abstract class Iphone {
    String cor;
    Boolean comMemoriaExtra;

    public Iphone(String cor, Boolean comMemoriaExtra) {
        this.cor = cor;
        this.comMemoriaExtra = comMemoriaExtra;
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
