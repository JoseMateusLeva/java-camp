package PooJava3.integradora1.exercicio1.classes;

import PooJava3.integradora1.exercicio1.interfaces.ConsultarSaldo;
import PooJava3.integradora1.exercicio1.interfaces.PagamentoServico;
import PooJava3.integradora1.exercicio1.interfaces.SaqueDinheiro;

public class Basico implements ConsultarSaldo, PagamentoServico, SaqueDinheiro {
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo...");
    }

    @Override
    public void pagamentoServico(String type) {
        System.out.println("Pagando serviço: " + type);
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
