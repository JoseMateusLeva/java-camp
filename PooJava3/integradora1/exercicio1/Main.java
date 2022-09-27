package PooJava3.integradora1.exercicio1;

import PooJava3.integradora1.exercicio1.classes.Basico;
import PooJava3.integradora1.exercicio1.classes.Cobrador;
import PooJava3.integradora1.exercicio1.classes.Executivo;

public class Main {
    public static void main(String[] args) {
        executivo();
        cobrador();
        basico();
    }

    public static void executivo() {
        Executivo executivo = new Executivo();
        executivo.deposito(9000.0);
        executivo.transacaoOk("Depósito");
        executivo.transferencia(3000.0);
        executivo.transacaoNaoOk("Transferência");
    }

    public static void cobrador() {
        Cobrador cobrador = new Cobrador();
        cobrador.consultarSaldo();
        cobrador.saque(2345.60);
        cobrador.transacaoNaoOk("Saque");
    }

    public static void basico() {
        Basico basico = new Basico();
        basico.consultarSaldo();
        basico.saque(500.0);
        basico.transacaoOk("Saque");
        basico.pagamentoServico("Internet");
    }
}
