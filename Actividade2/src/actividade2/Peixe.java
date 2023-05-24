package actividade2;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, String ambiente, int patas, String cor, String caracteristica) {
        super(nome, ambiente, patas, cor);
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return super.toString() +
               "\nCaracterística: " + caracteristica;
    }
}
