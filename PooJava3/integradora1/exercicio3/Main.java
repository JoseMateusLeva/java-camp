package PooJava3.integradora1.exercicio3;

import PooJava3.integradora1.exercicio3.model.Cachorro;
import PooJava3.integradora1.exercicio3.model.Gato;
import PooJava3.integradora1.exercicio3.model.Vaca;

public class Main {

    public static void main(String[] args) {
        cat();
        dog();
        vaca();
    }

    public static void cat() {
        Gato cat = new Gato("Macarena", "Vira-lata");
        cat.sound();
        cat.comerCarne();
    }

    public static void dog() {
        Cachorro dog = new Cachorro("Rex", "Vira-lata");
        dog.sound();
        dog.comerCarne();
    }

    public static void vaca() {
        Vaca vaca = new Vaca("Mimoza", "Nelore");
        vaca.sound();
        vaca.comerPasto();
    }
}
