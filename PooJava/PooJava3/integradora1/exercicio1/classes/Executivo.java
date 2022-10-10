package PooJava.PooJava3.integradora1.exercicio1.classes;

import PooJava.PooJava3.integradora1.exercicio1.interfaces.Deposito;
import PooJava.PooJava3.integradora1.exercicio1.interfaces.Tranferencia;

public class Executivo implements Deposito, Tranferencia {
    @Override
    public void deposito(Double value) {
        System.out.println("Deposito de R$: " + value);
    }

    @Override
    public void transferencia(Double value) {
        System.out.println("Trnsferencia de R$: " + value);
    }

    @Override
    public void transacaoOk(String tipoTransacc) {
        System.out.println(tipoTransacc + " realizado");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacc) {
        System.out.println(tipoTransacc + " não realizado");
    }
}
