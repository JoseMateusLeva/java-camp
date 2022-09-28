package PooJava5.integradora1;

import PooJava5.integradora1.model.Carro;
import PooJava5.integradora1.model.Corrida;
import PooJava5.integradora1.model.Motocicleta;
import PooJava5.integradora1.model.Veiculo;

public class Main {

    private static String PLACA = "Pedramóbil";

    public static void main(String[] args) {
        Corrida corridaMaluca = new Corrida(100, 10000.0, "Corrida Maluca", 4);

        Carro carro00 = new Carro(99.0, 9.0, 9.0, "Máquina Malvada");
        Carro carro01 = new Carro(88.0, 8.0, 8.0, "Pedramóbil");
        Carro carro02 = new Carro(77.0, 7.0, 7.0, "Coupé Assombrado");
        Motocicleta motocicleta01 = new Motocicleta(77.0, 7.0, 7.0, "Lata Escarlate");
        Carro carro03 = new Carro(77.0, 7.0, 7.0, " Gato Compacto");


        System.out.println("Adicionando carros...");
        corridaMaluca.addCarro(carro00);
        corridaMaluca.addCarro(carro01);
        corridaMaluca.addCarro(carro02);

        System.out.println("\nAdicionando carro extra...");
        corridaMaluca.addCarro(carro02);

        System.out.println("\nAdicionando motocicleta...");
        corridaMaluca.addMoto(motocicleta01);

        System.out.println("\nAdicionando carro extra 2...");
        corridaMaluca.addCarro(carro03);

        System.out.println("\nRemovendo veiculo...");
        corridaMaluca.deleteVeiculo(motocicleta01);

        System.out.println("\nRemovendo veiculo pela placa: ");
        corridaMaluca.deleteVeiculoComPlaca("Pedramóbil");

        System.out.println("\nIniciando corrida!");
        corridaMaluca.socorrerAuto("Máquina Malvada");
        corridaMaluca.socorrerAuto("Lata Escarlate");
        corridaMaluca.socorrerMoto("Lata Escarlate");

        Veiculo veiculoRandomico = corridaMaluca.randomWinner();
        System.out.println("\nVencedor com sistema randomico.");
        System.out.println("VENCEDOR: " + veiculoRandomico.getPlaca() + " LEVA " + corridaMaluca.getPremioDollar() + " dólares");

        Veiculo veiculoDesempenho = corridaMaluca.randomWinner();
        System.out.println("\nVencedor com sistema de desempenho.");
        System.out.println("VENCEDOR: " + veiculoDesempenho.getPlaca() + " LEVA " + corridaMaluca.getPremioDollar() + " dólares");

        System.out.println("\nListando todos os veiculos que partiparam da corrida");
        corridaMaluca.listarVeiculos();
    }
}
