package PooJava.PooJava4.integradora1.model;

public class Cliente {
    private Long ID;
    private String name;
    private String sobreNome;

    public Cliente(Long ID, String name, String sobreNome) {
        this.ID = ID;
        this.name = name;
        this.sobreNome = sobreNome;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        return "Id: " + ID + ", nome: " + name + " " + sobreNome;
    }
}
