package PooJava.PooJava3.integradora1.exercicio3.model;

import PooJava.PooJava3.integradora1.exercicio3.interfaces.Animal;
import PooJava.PooJava3.integradora1.exercicio3.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {

    public Vaca(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void sound() {
        System.out.println("mu");
    }

    @Override
    public void comerPasto() {
        System.out.println(this.getName() + " ... comendo pasto");
    }
}
