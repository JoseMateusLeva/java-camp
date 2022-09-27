package PooJava3.integradora1.exercicio2.classes;

public abstract class Documento {
    private String typeOfDocument;

    public Documento(String typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    @Override
    public String toString() {
        return "Documento tipo: " + typeOfDocument;
    }
}