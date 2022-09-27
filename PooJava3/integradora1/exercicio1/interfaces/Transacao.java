package PooJava3.integradora1.exercicio1.interfaces;

public interface Transacao {
    public abstract void transacaoOk(String tipoTransacc);

    public abstract void transacaoNaoOk(String tipoTransacc);
}
