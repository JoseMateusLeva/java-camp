package PooJava3.integradora1.exercicio2.classes;

public class Pessoa {
    private String name;

    public Pessoa(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome: " + name;
    }
}
