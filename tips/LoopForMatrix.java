package tips;

public class LoopForMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][1] = 2;
        matrix[1][1] = 3;
        int temp = 0;

        for (int f = 0; f <= 2; f++) {
            for (int c = 0; c <= 2; c++) {
                System.out.println("Linha: " + f + ", Coluna: " + c);
                System.out.println("Tenho guardado um: " + matrix[f][c]);

                if (matrix[f][c] > 0) {
                    temp += matrix[f][c];
                    System.out.println("Valor: " + c);
                }
            }
        }

        System.out.println("Total: " + temp);
    }
}
