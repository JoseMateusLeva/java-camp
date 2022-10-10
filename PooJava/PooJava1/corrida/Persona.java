package PooJava.PooJava1.corrida;

public class Persona {
    private int id, age;
    private String rg, name;

    public Persona(int id, String rg, String name, int age) {
        this.id = id;
        setRg(rg);
        setAge(age);
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAge() {
        return this.age;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getName() {
        return this.name;
    }

    public String getRg() {
        return this.rg;
    }

    public int getId() {
        return this.id;
    }

    public void viewPersona() {
        System.out.println("Number: " + this.getId() + ", rg: " + this.getRg() + ", nome: " + this.getName());
    }
}