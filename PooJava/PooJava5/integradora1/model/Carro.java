package PooJava.PooJava5.integradora1.model;

public class Carro extends Veiculo {
    private static final double PESO = 1000.0;
    private static final int RODAS = 4;

    public Carro(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, PESO, RODAS);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
