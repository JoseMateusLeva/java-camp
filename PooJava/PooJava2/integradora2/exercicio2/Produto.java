package PooJava.PooJava2.integradora2.exercicio2;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcular(int quantidadeDeProdutos) {
        return this.preco * quantidadeDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nome='" + nome + ", preco=" + preco;
    }
}
