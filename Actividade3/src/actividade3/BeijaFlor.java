package actividade3;

public class BeijaFlor extends Ave {
    private String corBico;

    public BeijaFlor(String nome, String ambiente, int patas, String cor, boolean voa, String corBico) {
        super(nome, ambiente, patas, cor, voa);
        this.corBico = corBico;
    }

    public String toString() {
        return super.toString() +
               "\nCor do Bico: " + corBico;
    }
}