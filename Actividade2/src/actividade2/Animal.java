
package actividade2;

public class Animal {
    protected String nome;
    protected String ambiente;
    protected int patas;
    protected String cor;

    public Animal(String nome, String ambiente, int patas, String cor) {
        this.nome = nome;
        this.ambiente = ambiente;
        this.patas = patas;
        this.cor = cor;
    }

    public String toString() {
        return "Nome: " + nome +
               "\nAmbiente: " + ambiente +
               "\nPatas: " + patas +
               "\nCor: " + cor;
    }
}