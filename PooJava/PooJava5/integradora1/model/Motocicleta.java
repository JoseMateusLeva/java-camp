package PooJava.PooJava5.integradora1.model;

public class Motocicleta extends Veiculo {
    private static final double PESO = 300;
    private static final int RODAS = 2;

    public Motocicleta(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, PESO, RODAS);
    }
}
