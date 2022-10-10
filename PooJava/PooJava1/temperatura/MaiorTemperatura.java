package PooJava.PooJava1.temperatura;

import java.util.ArrayList;

public class MaiorTemperatura {
    public static void main(String[] args) {

        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires",
                "Asunción", "São Paulo", "Lima", "Santigado de Chile", "Lisboa", "Tokio"};

        int[][] temp = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        ArrayList<Cities> list = new ArrayList<Cities>();

        for (int i = 0; i < cities.length; i++) {
            list.add(new Cities(i, cities[i], temp[i][0], temp[i][1]));
        }

        getTemperature(list);
    }

    public static void getTemperature(ArrayList<Cities> list) {
        int minimum = 0;
        int maximum = 0;
        String citie_min = " ";
        String citie_max = " ";

        for (Cities c : list) {
            if (c.minimum <= minimum) {
                minimum = c.minimum;
                citie_min = c.name;
            }

            if (c.maximum >= maximum) {
                maximum = c.maximum;
                citie_max = c.name;
            }
        }

        System.out.println("Menor temperatura: " + minimum + ", na cidade de " + citie_min);
        System.out.println("Maior temperatura: " + maximum + ", na cidade de " + citie_max);
    }
}