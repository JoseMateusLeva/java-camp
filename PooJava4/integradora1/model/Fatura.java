package PooJava4.integradora1.model;

import java.util.List;

public class Fatura {
    private Long cod;
    private Cliente cliente;
    List<Item> listItens;
    private double totalCompra;

    public Fatura(Long cod, Cliente cliente, List<Item> listItens, double totalCompra) {
        this.cod = cod;
        this.cliente = cliente;
        this.listItens = listItens;
        this.totalCompra = totalCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public List<Item> getListItens() {
        return listItens;
    }

    public void setListItens(List<Item> listItens) {
        this.listItens = listItens;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public void valorTotal() {
        this.totalCompra = 0;
        for (Item item : listItens) {
            totalCompra += item.getValorUnitario() * item.getQuantidade();
        }
    }

    @Override
    public String toString() {
        return "Fatura{codigo=" + cod + ", cliente" + cliente.getName() + ", valorTotal=" + getTotalCompra();
    }
}
