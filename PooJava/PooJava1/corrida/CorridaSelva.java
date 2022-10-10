package PooJava.PooJava1.corrida;

import java.util.ArrayList;
import java.util.Scanner;


public class CorridaSelva {
    static ArrayList<Persona> minimum = new ArrayList<Persona>();
    static ArrayList<Persona> median = new ArrayList<Persona>();
    static ArrayList<Persona> advanced = new ArrayList<Persona>();

    static Scanner ent = new Scanner(System.in);

    static ArrayList<Persona> list;

    public static void main(String[] args) {

        while (true) {
            System.out.println("[1] Para registrar");
            System.out.println("[2] Para visualizar");
            System.out.println("[3] Para remover");
            System.out.println("[4] Para Sair");

            int syn = ent.nextInt();

            switch (syn) {
                case 1 -> {
                    setCircuit();
                    addPersona();
                }
                case 2 -> {
                    setCircuit();
                    viewAllPersonas();
                }
                case 3 -> {
                    setCircuit();
                    removePersona();
                }
                default -> System.exit(0);
            }
        }
    }

    private static void setCircuit() {
        System.out.println("[1] Circuito pequeno");
        System.out.println("[2] Circuito médio");
        System.out.println("[3] Circuito avançado");

        int syn = ent.nextInt();

        if (syn == 1) {
            list = minimum;
        } else if (syn == 2) {
            list = median;
        } else {
            list = advanced;
        }
    }

    private static void removePersona() {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o RG: ");
        String rg = ent.nextLine();

        if (list.removeIf(p -> p.getRg().equals(rg))) {
            System.out.println("Registro com o RG: " + rg + " removido!");
        }
    }

    private static void addPersona() {
        Scanner ent = new Scanner(System.in);

        int idNumber = list.size();

        System.out.println("Insira o RG: ");
        String rg = ent.nextLine();

        System.out.println("Insira o Nome: ");
        String name = ent.nextLine();

        System.out.println("Insira a Idade: ");
        int age = ent.nextInt();

        Persona persona = new Persona(idNumber + 1, rg, name, age);
        Value value = new Value(persona, Type.MEDIO);

        list.add(persona);
    }

    private static void viewAllPersonas() {
        for (Persona p : list) {
            p.viewPersona();
        }
    }
}
