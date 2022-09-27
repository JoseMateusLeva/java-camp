package PooJava3.integradora1.exercicio3.interfaces;

public abstract class Animal {
    private String name;
    private String breed;

    public abstract void sound();

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", raça: " + breed;
    }
}
