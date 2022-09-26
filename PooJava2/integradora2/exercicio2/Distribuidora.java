package PooJava2.integradora2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        Produto salame = new Pereciveis("Salame", 12.50, 17);
        Produto queijo = new Pereciveis("Queijo", 33.00, 11);
        Produto mortadela = new Pereciveis("Mortadela", 17.00, 14);
        Produto mamao = new Pereciveis("Mamão", 5.10, 3);
        Produto banana = new Pereciveis("banana", 4.50, 1);

        Produto cha = new NaoPereciveis("Chá", 1.75, "industrializado");
        Produto feijao = new NaoPereciveis("Feijão", 7.89, "industrializado");
        Produto pipoca = new NaoPereciveis("Pipoca", 4.50, "industrializado");
        Produto farofa = new NaoPereciveis("Farofa", 5.00, "industrializado");
        Produto cafe = new NaoPereciveis("Café", 5.99, "industrializado");

        List<Vender> vendendo = new ArrayList<>();

        vendendo.add(new Vender(salame, 1));
        vendendo.add(new Vender(queijo, 1));
        vendendo.add(new Vender(mortadela, 1));
        vendendo.add(new Vender(mamao, 1));
        vendendo.add(new Vender(banana, 1));

        vendendo.add(new Vender(cha, 1));
        vendendo.add(new Vender(feijao, 1));
        vendendo.add(new Vender(pipoca, 2));
        vendendo.add(new Vender(farofa, 1));
        vendendo.add(new Vender(cafe, 1));

        double valorTotal = 0;
        for (Vender item : vendendo) {
            valorTotal += item.getProduto().calcular(item.getQuantidade());
            System.out.println(item.getProduto());
        }

        System.out.println("TOTAL = " + valorTotal);
    }
}
