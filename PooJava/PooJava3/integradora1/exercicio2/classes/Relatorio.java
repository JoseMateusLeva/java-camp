package PooJava.PooJava3.integradora1.exercicio2.classes;

public class Relatorio extends Documento {
    private String text;
    private int numberOfPage;
    private String writer;
    private String reviewer;

    public Relatorio(String typeOfDocument, String text, int numberOfPage, String writer, String reviewer) {
        super(typeOfDocument);
        this.text = text;
        this.numberOfPage = numberOfPage;
        this.writer = writer;
        this.reviewer = reviewer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "texto: " + text + ", numero de paginas: " + numberOfPage + ", autor: " + writer + ", revisor: " + reviewer;
    }
}
