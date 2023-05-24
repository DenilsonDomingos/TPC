package actividade3;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, String ambiente, int patas, String cor, String tipoPelo, String raca) {
        super(nome, ambiente, patas, cor, tipoPelo);
        this.raca = raca;
    }

    public String toString() {
        return super.toString() +
               "\nRaça: " + raca;
    }
}