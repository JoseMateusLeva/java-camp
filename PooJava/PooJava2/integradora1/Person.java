package PooJava.PooJava2.integradora1;

public class Person {

    // Exercício 01: Declaração dos atributos
    private String name;
    private int age;
    private String ID;
    private double weight;
    private double height;

    // Exercício 02: construtor sem parâmetro
    public Person() {

    }

    // Exercício 02: construtor com parâmetro
    public Person(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public Person(String name, int age, String ID, double weight, double height) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.weight = weight;
        this.height = height;
    }

    public int calcularIMC() {
        double imc = this.weight / (Math.pow(this.height, 2));

        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        }

        return 0;
    }

    public boolean ehMaiorIdade() {
        return this.age >= 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ID: " + getID() +
                ", nome: " + getName() +
                ", idade: " + getAge() +
                ", altura: " + getHeight() +
                ", peso: " + getWeight() + " Kg";
    }
}
