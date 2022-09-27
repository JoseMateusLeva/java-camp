package PooJava3.integradora1.exercicio3.model;

import PooJava3.integradora1.exercicio3.interfaces.Animal;
import PooJava3.integradora1.exercicio3.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    public Gato(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void sound() {
        System.out.println("miau");
    }

    @Override
    public void comerCarne() {
        System.out.println(this.getName() + " ... comendo carne");
    }
}
