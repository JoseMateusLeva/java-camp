package PooJava.PooJava3.integradora1.exercicio2.classes;

public class Habilidade {
    private String ability;

    public Habilidade(String ability) {
        setAbility(ability);
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Descrição: " + ability;
    }
}
