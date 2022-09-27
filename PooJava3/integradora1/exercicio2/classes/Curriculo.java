package PooJava3.integradora1.exercicio2.classes;

import java.util.List;


public class Curriculo extends Documento {
    private Pessoa person;
    List<Habilidade> listOfAbilities;

    public Curriculo(String typeOfDocument, Pessoa person, List<Habilidade> listOfAbilities) {
        super(typeOfDocument);
        this.listOfAbilities = listOfAbilities;
        this.person = person;
    }

    @Override
    public String toString() {
        return "curriculo{pessoa=" + person + ", habilidades=" + listOfAbilities + "}";
    }
}