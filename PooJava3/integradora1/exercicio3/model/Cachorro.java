package PooJava3.integradora1.exercicio3.model;

import PooJava3.integradora1.exercicio3.interfaces.Animal;
import PooJava3.integradora1.exercicio3.interfaces.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {

    public Cachorro(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void sound() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println(this.getName() + " ... comendo carne");
    }
}
