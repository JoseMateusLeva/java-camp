package PooJava3.integradora1.classes;

import PooJava3.integradora1.interfaces.ConsultarSaldo;
import PooJava3.integradora1.interfaces.SaqueDinheiro;

public class Cobrador implements SaqueDinheiro, ConsultarSaldo {
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo...");
    }

    @Override
    public void saque(double saque) {
        System.out.println("Saque R$ " + saque);
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
