package PooJava5.integradora1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Corrida {
    private static double MEIA_ACELARACAO = .5;
    private double distancia;
    private double premioDollar;
    private String nome;
    private int numeroVeiculoPermitido;
    List<Veiculo> listaDeVeiculos;

    public Corrida(double distancia, double premioDollar, String nome, int numeroVeiculoPermitido) {
        this.distancia = distancia;
        this.premioDollar = premioDollar;
        this.nome = nome;
        this.numeroVeiculoPermitido = numeroVeiculoPermitido;
        this.listaDeVeiculos = new ArrayList<>();
    }

    public void listarVeiculos() {
        listaDeVeiculos.stream().forEach(System.out::println);
    }

    public void addCarro(Carro carro) {
        if (temVaga()) {
            if (listaDeVeiculos.contains(carro)) {
                System.out.println("Este carro já esta registrado na corriga :: " + carro.getPlaca());
            } else {
                listaDeVeiculos.add(carro);
                System.out.println("Carro com placa: " + carro.getPlaca() + " adicionado!");
            }
            return;
        }

        System.out.println("Desculpe mas a corrida está lotada!");
    }

    public void addMoto(Motocicleta motocicleta) {
        if (temVaga()) {
            if (listaDeVeiculos.contains(motocicleta)) {
                System.out.println("Este motocicleta já esta registrado na corriga :: " + motocicleta.getPlaca());
            } else {
                listaDeVeiculos.add(motocicleta);
                System.out.println("Motocicleta com placa: " + motocicleta.getPlaca() + " adicionado!");
            }
            return;
        }

        System.out.println("Desculpe mas a corrida está lotada!");
    }

    private boolean temVaga() {
        int total = listaDeVeiculos.size();
        return numeroVeiculoPermitido > total;
    }

    public Veiculo vencedorCorrida() {
        double melhorDesempenho = 0;
        double desempenhoAtual;
        Veiculo vencedor = null;

        for (Veiculo v : listaDeVeiculos) {
            desempenhoAtual = desempenho(v);
            if (melhorDesempenho < desempenhoAtual) {
                melhorDesempenho = desempenhoAtual;
                vencedor = v;
            }
        }

        return vencedor;
    }

    public double desempenho(Veiculo v) {
        return v.getVelocidade() * (MEIA_ACELARACAO * v.getAceleracao()) / (v.getAnguloGiro() * (v.getPeso() - v.getRodas() * 100));
    }

    public Veiculo randomWinner() {
        Random random_method = new Random();
        int index = random_method.nextInt(listaDeVeiculos.size());
        return listaDeVeiculos.get(index);
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDollar() {
        return premioDollar;
    }

    public void setPremioDollar(double premioDollar) {
        this.premioDollar = premioDollar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVeiculoPermitido() {
        return numeroVeiculoPermitido;
    }

    public void setNumeroVeiculoPermitido(int numeroVeiculoPermitido) {
        this.numeroVeiculoPermitido = numeroVeiculoPermitido;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
