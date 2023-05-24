package actividade3;

public class Homem extends Mamifero {
    private int idade;

    public Homem(String nome, String ambiente, int patas, String cor, String tipoPelo, int idade) {
        super(nome, ambiente, patas, cor, tipoPelo);
        this.idade = idade;
    }

    public String toString() {
        return super.toString() +
               "\nIdade: " + idade;
    }
}