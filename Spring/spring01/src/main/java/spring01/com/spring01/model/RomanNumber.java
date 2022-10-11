package Spring.spring01.com.spring01.model;

import java.util.TreeMap;

public class RomanNumber {
    private final static TreeMap<Integer, String> alphabet = new TreeMap<>();

    static {
        alphabet.put(1000, "M");
        alphabet.put(900, "CM");
        alphabet.put(500, "D");
        alphabet.put(400, "CD");
        alphabet.put(100, "C");
        alphabet.put(90, "XC");
        alphabet.put(50, "L");
        alphabet.put(40, "XL");
        alphabet.put(10, "X");
        alphabet.put(9, "IX");
        alphabet.put(5, "V");
        alphabet.put(4, "IV");
        alphabet.put(1, "I");
    }

    public static String toRoman(int number) {
        int l = alphabet.floorKey(number);

        if (number == l) {
            return alphabet.get(number);
        }
        return alphabet.get(l) + toRoman(number - l);
    }
}
