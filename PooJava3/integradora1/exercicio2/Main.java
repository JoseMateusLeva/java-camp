package PooJava3.integradora1.exercicio2;

import PooJava3.integradora1.exercicio2.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Mateus");
        Habilidade h1 = new Habilidade("Aluno");
        List<Habilidade> abilityList = new ArrayList<>();
        abilityList.add(h1);

        Curriculo curriculum = new Curriculo("PDF", person, abilityList);
        Imprimir.imprimir(curriculum);

        Livro book = new Livro(364, "William Gibson", "Neuromancer", "Fiction", "PDF");
        Imprimir.imprimir(book);

        Relatorio paper = new Relatorio("PDF", "Primeiro relatório", 1, "Mateus", "Mateus");
        Imprimir.imprimir(paper);
    }
}
