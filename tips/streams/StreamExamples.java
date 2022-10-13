package tips.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        String[] data = {"Java", "Python", "PHP", "Javascript"};

        example01(data);
        example02(data);
        example03(5);
        System.out.println(example04());
        example05();
    }

    public static void example01(String[] data) {
        System.out.println("[1] Example :: map ---------");

        Stream.of(data)
                // Normal method
                //.map(languages -> languages.toUpperCase())
                .map(String::toUpperCase) // Using lambda method (String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void example02(String[] data) {
        System.out.println("[2] Example :: map ---------");

        List<String> languages = Stream.of(data)
                .map(String::toUpperCase) // Using lambda model (String::toUpperCase)
                // .collect(Collectors.toList());
                .collect(Collectors.toList());

        languages.forEach(System.out::println);
    }

    public static void example03(int minimum) {
        System.out.println("[3] Example :: filter ---------");

        Integer[] numbersOfArray = {1, 3, 4, 7, 8, 99, 1};
        List<Integer> numbers = Arrays.asList(numbersOfArray);

        numbers.stream().filter(number -> number >= minimum).forEach(System.out::println);
    }

    public static int example04() {
        System.out.println("[4] Example :: MapToInt && sum() ---------");

        Integer[] numbersOfArray = {1, 3, 4, 7, 8, 99};
        List<Integer> numbers = Arrays.asList(numbersOfArray);

        return numbers.stream().mapToInt(number -> number * number).sum();
    }

    public static void example05() {
        ArrayList<Data> data = new ArrayList<Data>();

        Data data1 = new Data(1, "Mateus01", "Tech");
        Data data2 = new Data(2, "Mateus02", "Admin");
        Data data3 = new Data(3, "Mateus03", "Leader");
        Data data4 = new Data(4, "Mateus04", "Tech");
        Data data5 = new Data(5, "Mateus05", "Tech");

        data.add(data1);
        data.add(data2);
        data.add(data3);
        data.add(data4);
        data.add(data5);

        data.stream()
                .filter(x -> x.getPosition().equals("Tech"))
                .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName())) // Ordenação do array
                .forEach(System.out::println);
    }
}
