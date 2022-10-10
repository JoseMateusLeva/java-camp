package PooJava.PooJava3.integradora1.exercicio2.classes;

public class Livro extends Documento {
    private int numberOfPage;
    private String writer;
    private String title;
    private String genre;

    public Livro(int numberOfPage, String writer, String title, String genre, String typeOfDocument) {
        super(typeOfDocument);
        this.numberOfPage = numberOfPage;
        this.genre = genre;
        this.writer = writer;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Titulo: " + title + ", autor: " + writer + ", genero: " + genre + ", quantidade de paginas: " + numberOfPage;
    }
}
