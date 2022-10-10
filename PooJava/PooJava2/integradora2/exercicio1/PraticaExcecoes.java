package PooJava.PooJava2.integradora2.exercicio1;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        // Primeira parte
        partA(a, b);

        try {
            // Segunda parte
            partB(a, b);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void partB(int a, int b) throws IllegalArgumentException {
        System.out.println("2 -------");
        try {
            int result = b / a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa Finalizado.");
        }
    }

    public static void partA(int a, int b) {
        System.out.println("1 -------");
        try {
            int result = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro.");
            // java.lang.ArithmeticException: / by zero
            // System.out.println(e);
        } finally {
            System.out.println("Programa Finalizado.");
        }
    }
}
