package PooJava.PooJava4.integradora1.model;

public class Item {
    private String nome;
    private int quantidade;
    private double valorUnitario;
    private Long cod;

    public Item(String nome, int quantidade, double valorUnitario, Long cod) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "cod: " + getCod() + ", nome: " + getNome() + ", quantidade: " + getQuantidade() + ", valor unitario: " + getValorUnitario();
    }
}
