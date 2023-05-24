package actividade3;

public class Mamifero extends Animal {
    protected String tipoPelo;

    public Mamifero(String nome, String ambiente, int patas, String cor, String tipoPelo) {
        super(nome, ambiente, patas, cor);
        this.tipoPelo = tipoPelo;
    }

    public String toString() {
        return super.toString() +
               "\nTipo de Pelo: " + tipoPelo;
    }
}
