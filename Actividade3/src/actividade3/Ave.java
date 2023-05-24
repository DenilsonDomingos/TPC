package actividade3;

public class Ave extends Animal {
    protected boolean voa;

    public Ave(String nome, String ambiente, int patas, String cor, boolean voa) {
        super(nome, ambiente, patas, cor);
        this.voa = voa;
    }

    public String toString() {
        return super.toString() +
               "\nVoa: " + (voa ? "Sim" : "Não");
    }
}