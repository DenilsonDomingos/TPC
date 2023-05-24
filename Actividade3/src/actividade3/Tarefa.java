package actividade3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    public static void main(String[] args) {
        List<Animal> animais = lerAnimaisDoArquivo("animais.txt");

        System.out.println("Informações dos Cachorros:");
        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println(cachorro.toString());
                System.out.println();
            }
        }

        System.out.println("Informações dos Homens:");
        for (Animal animal : animais) {
            if (animal instanceof Homem) {
                Homem homem = (Homem) animal;
                System.out.println(homem.toString());
                System.out.println();
            }
        }

        System.out.println("Informações dos Beija-Flores:");
        for (Animal animal : animais) {
            if (animal instanceof BeijaFlor) {
                BeijaFlor beijaFlor = (BeijaFlor) animal;
                System.out.println(beijaFlor.toString());
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

                if (tipoAnimal.equals("Cachorro")) {
                    String tipoPelo = partes[5];
                    String raca = partes[6];
                    animais.add(new Cachorro(nome, ambiente, patas, cor, tipoPelo, raca));
                } else if (tipoAnimal.equals("Homem")) {
                    String tipoPelo = partes[5];
                    int idade = Integer.parseInt(partes[6]);
                    animais.add(new Homem(nome, ambiente, patas, cor, tipoPelo, idade));
                } else if (tipoAnimal.equals("BeijaFlor")) {
                    boolean voa = Boolean.parseBoolean(partes[5]);
                    String corBico = partes[6];
                    animais.add(new BeijaFlor(nome, ambiente, patas, cor, voa, corBico));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return animais;
    }
}
