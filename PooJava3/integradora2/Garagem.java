package PooJava3.integradora2;

import java.util.Comparator;
import java.util.List;

public class Garagem {
    protected String id;
    List<Veiculo> listVeiculo;

    public Garagem(String id, List<Veiculo> listVeiculo) {
        this.id = id;
        this.listVeiculo = listVeiculo;
    }


    public void exercicio5() {
        System.out.println("\nOrdenando por preço superior a 1000...");

        listVeiculo.stream()
                .filter((veiculo -> veiculo.getPreco() > 1000)) // Ordenação do array
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(System.out::println);
    }

    public void exercicio6() {
        System.out.println("\nOrdenando por preço superior ou igual a 1000...");

        listVeiculo.stream()
                .filter((veiculo -> veiculo.getPreco() >= 1000)) // Ordenação do array
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(System.out::println);
    }

    public double exercicio7() {
        return listVeiculo.stream()
                .mapToDouble(Veiculo::getPreco)
                .average().getAsDouble();
    }

    public void exercicio4() {
        System.out.println("\nOrdenando por marca...");

        listVeiculo.stream()
                .sorted((x, y) -> x.getMarca().compareToIgnoreCase(y.getMarca())) // Ordenação do array
                .forEach(System.out::println);
    }

    public void exercicio3() {
        System.out.println("\nOrdenando por preço...");

        listVeiculo.stream()
                .sorted(Comparator.comparing(Veiculo::getPreco)) // Ordenação do array
                .forEach(System.out::println);
    }
}
