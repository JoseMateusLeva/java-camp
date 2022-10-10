package PooJava.PooJava4.integradora1.repositorio;

import java.util.ArrayList;
import java.util.List;

import PooJava.PooJava4.integradora1.interfaces.Geral;
import PooJava.PooJava4.integradora1.model.Cliente;

public class ClienteRep implements Geral {
    List<Cliente> clientes;

    public ClienteRep() {
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

//    public void getClienteById(long id) {
//        clientes.stream().filter((cliente) -> cliente.getID() == id).limit(1).forEach(System.out::println);
//    }

    public void getClienteById(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getID().equals(id)) {
                System.out.println("Cliente encontrado");
                System.out.println("ID: " + cliente.getID() + ", nome: " + cliente.getName());
                return;
            }
        }

        System.out.println("Cliente não encontrado");
    }

    @Override
    public void removeById(Long id) {
        if (clientes.removeIf(cliente -> cliente.getID().equals(id))) {
            System.out.println("Cliente removido");
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    @Override
    public void exibir() {
        clientes.forEach(System.out::println);
    }
}
