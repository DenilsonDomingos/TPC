package actividade2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    public static void main(String[] args) {
        List<Animal> animais = lerAnimaisDoArquivo("animais.txt");

        System.out.println("Informações dos Mamíferos:");
        for (Animal animal : animais) {
            if (animal instanceof Mamifero) {
                Mamifero mamifero = (Mamifero) animal;
                System.out.println(mamifero.toString());
                System.out.println();
            }
        }

        System.out.println("Informações dos Peixes:");
        for (Animal animal : animais) {
            if (animal instanceof Peixe) {
                Peixe peixe = (Peixe) animal;
                System.out.println(peixe.toString());
                System.out.println();
            }
        }
    }

    public static List<Animal> lerAnimaisDoArquivo(String nomeArquivo) {
        List<Animal> animais = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");

                String tipoAnimal = partes[0];
                String nome = partes[1];
                String ambiente = partes[2];
                int patas = Integer.parseInt(partes[3]);
                String cor = partes[4];

                if (tipoAnimal.equals("Mamifero")) {
                    String caracteristica = partes[5];
                    animais.add(new Mamifero(nome, ambiente, patas, cor, caracteristica));
                } else if (tipoAnimal.equals("Peixe")) {
                    String caracteristica = partes[5];
                    animais.add(new Peixe(nome, ambiente, patas, cor, caracteristica));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return animais;
    }
}
