package PooJava.PooJava4.integradora1;

import PooJava.PooJava4.integradora1.model.Cliente;
import PooJava.PooJava4.integradora1.model.Fatura;
import PooJava.PooJava4.integradora1.model.Item;
import PooJava.PooJava4.integradora1.repositorio.ClienteRep;
import PooJava.PooJava4.integradora1.repositorio.ItemRep;

import java.util.Scanner;

public class Main {
    static ClienteRep clienteRep = new ClienteRep();
    static ItemRep item = new ItemRep();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nIniciando processo com classe Cliente\n");

        Cliente c1 = new Cliente(1L, "Leo", "Bueno");

        clienteRep.addCliente(c1);
        clienteRep.addCliente(new Cliente(2L, "Mateus", "Camargo"));
        clienteRep.addCliente(new Cliente(3L, "Bruno", "Cage"));

        clienteRep.exibir();
        //getCliente();
        //removeClienteById();
        //clienteRep.exibir();

        System.out.println("\nIniciando processo com classe Item\n");

        Item i1 = new Item("Produto1", 1, 1.0, 1L);

        item.addCliente(i1);
        item.addCliente(new Item("Produto2", 2, 2.2, 2L));
        item.addCliente(new Item("Produto3", 3, 3.3, 3L));

        item.exibir();
        //getItem();
        //removeItemById();
        //item.exibir();

        Fatura fatura = new Fatura(1L, c1, item.getItems());
        System.out.println("\n" + fatura);
    }

    public static void getCliente() {
        System.out.println("Para buscar um cliente, insira o ID: ");
        long id = scanner.nextLong();
        clienteRep.getClienteById(id);
    }

    public static void removeClienteById() {
        System.out.println("Para remover um cliente, insira o ID: ");
        long id = scanner.nextLong();
        clienteRep.removeById(id);
    }

    public static void getItem() {
        System.out.println("Para buscar um Item, insira o ID: ");
        long id = scanner.nextLong();
        item.getItemById(id);
    }

    public static void removeItemById() {
        System.out.println("Para remover um Item, insira o ID: ");
        long id = scanner.nextLong();
        item.removeById(id);
    }
}
