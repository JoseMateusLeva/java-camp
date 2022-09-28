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
    private SocorristaCarro salvaVidasAuto;
    private SocorristaMoto salvaVidasMoto;

    public Corrida(double distancia, double premioDollar, String nome, int numeroVeiculoPermitido) {
        this.distancia = distancia;
        this.premioDollar = premioDollar;
        this.nome = nome;
        this.numeroVeiculoPermitido = numeroVeiculoPermitido;
        this.listaDeVeiculos = new ArrayList<>();
        this.salvaVidasAuto = new SocorristaCarro();
        this.salvaVidasMoto = new SocorristaMoto();
    }

    public void socorrerAuto(String placa) {
        for (Veiculo v : listaDeVeiculos) {
            if (v.getPlaca().equals(placa) && (v instanceof Carro)) {
                salvaVidasAuto.socorrer((Carro) v);
                return;
            }
        }
        System.out.println("Veiculo não encontrado :: " + placa);
    }

    public void socorrerMoto(String placa) {
        for (Veiculo m : listaDeVeiculos) {
            if (m.getPlaca().equals(placa) && (m instanceof Motocicleta)) {
                salvaVidasMoto.socorrer((Motocicleta) m);
                return;
            }
        }
        System.out.println("Veiculo não encontrado :: " + placa);

    }

    public void deleteVeiculo(Veiculo veiculo) {
        if (listaDeVeiculos.remove(veiculo)) {
            System.out.println("Veiculo removido :: " + veiculo.getPlaca());
            return;
        }
        System.out.println("Veiculo não encontrado :: " + veiculo.getPlaca());
    }

    public void deleteVeiculoComPlaca(String placa) {
        if (listaDeVeiculos.removeIf((x) -> x.getPlaca().equals(placa))) {
            System.out.println("Veiculo com a placa: " + placa + ", removido com sucesso!");
            return;
        }
        System.out.println("Veiculo com a placa: " + placa + ", não encontrado!");
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
