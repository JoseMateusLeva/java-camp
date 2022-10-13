package interviews;

public class SumDigits {

    public static void main(String[] args) {
        int result = addDigits(388);
        System.out.println("Resultado: " + result);
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            int temp = 0;

            while (num > 0) {
                temp += num % 10; // Sobra
                System.out.println("Sobra da divisão por 10: " + temp);
                num /= 10;
                System.out.println("num: " + num);
            }
            num = temp;
        }

        return num;
    }
}

