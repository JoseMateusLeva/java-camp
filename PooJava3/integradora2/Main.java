package PooJava3.integradora2;

import PooJava3.integradora2.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static List<Veiculo> listaVeiculos = new ArrayList<>();

    public static void main(String[] args) {
        listaVeiculos.add(new Veiculo("Ford", "Fiesta", 10000.0));
        listaVeiculos.add(new Veiculo("Ford", "Focus", 1200.0));
        listaVeiculos.add(new Veiculo("Ford", "Explorer", 2500.0));
        listaVeiculos.add(new Veiculo("Fiat", "Uno", 500.0));
        listaVeiculos.add(new Veiculo("Fiat", "Cronos", 1000.0));
        listaVeiculos.add(new Veiculo("Fiat", "Torino", 1250.0));
        listaVeiculos.add(new Veiculo("Chevrolet", "Aveo", 1250.0));
        listaVeiculos.add(new Veiculo("Chevrolet", "Spin", 1250.0));
        listaVeiculos.add(new Veiculo("Toyota", "Corola", 1200.0));
        listaVeiculos.add(new Veiculo("Toyota", "Fortuner", 3000.0));
        listaVeiculos.add(new Veiculo("Renault", "Logan", 950.0));

        Garagem garagem = new Garagem("123", listaVeiculos);

        garagem.exercicio3();
        garagem.exercicio4();
        garagem.exercicio5();
        garagem.exercicio6();
        System.out.println("\nMédia total dos preços dos carros na garagem: " + garagem.exercicio7());
    }
}