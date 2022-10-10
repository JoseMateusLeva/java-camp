package PooJava.PooJava3.integradora2;

public class Veiculo {

    private String modelo;
    private String marca;
    private Double preco;

    public Veiculo(String modelo, String marca, Double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", modelo: " + modelo + ", preco: " + preco;
    }
}