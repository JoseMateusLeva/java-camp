package PooJava.PooJava4.integradora1.repositorio;

import PooJava.PooJava4.integradora1.interfaces.Geral;
import PooJava.PooJava4.integradora1.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRep implements Geral {
    List<Item> items;

    public ItemRep() {
        this.items = new ArrayList<>();
    }

    public void addCliente(Item item) {
        items.add(item);
    }


    public void getItemById(Long id) {
        for (Item item : items) {
            if (item.getCod().equals(id)) {
                System.out.println("Cliente encontrado");
                System.out.println("Nome: " + item.getNome());
                return;
            }
        }

        System.out.println("Cliente não encontrado");
    }

    @Override
    public void removeById(Long id) {
        if (items.removeIf(cliente -> cliente.getCod().equals(id))) {
            System.out.println("Item removido");
        } else {
            System.out.println("Item não encontrado");
        }
    }

    @Override
    public void exibir() {
        items.forEach(System.out::println);
    }

    public List<Item> getItems() {
        return items;
    }
}
