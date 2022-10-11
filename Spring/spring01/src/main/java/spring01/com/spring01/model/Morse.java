package Spring.spring01.com.spring01.model;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Morse {

    private static final Map<String, String> alphabet = new HashMap<>();
    private static final Pattern cSplit = Pattern.compile("");

    static {
        alphabet.put("", " ");
        alphabet.put("A", ".-");
        alphabet.put("B", "-...");
        alphabet.put("C", "-.-.");
        alphabet.put("D", "-..");
        alphabet.put("E", ".");
        alphabet.put("F", "..-.");
        alphabet.put("G", "--.");
        alphabet.put("H", "....");
        alphabet.put("I", "--");
        alphabet.put("J", ".---");
        alphabet.put("K", "-.-");
        alphabet.put("L", ".-..");
        alphabet.put("M", "--");
        alphabet.put("N", "-.");
        alphabet.put("O", "---");
        alphabet.put("P", ".--.");
        alphabet.put("Q", "--.-");
        alphabet.put("R", ".-.");
        alphabet.put("S", "...");
        alphabet.put("T", "-");
        alphabet.put("U", "..-");
        alphabet.put("V", "...-");
        alphabet.put("W", ".--");
        alphabet.put("X", "-..-");
        alphabet.put("Z", "--..");
        alphabet.put("1", ".----");
        alphabet.put("2", "..---");
        alphabet.put("3", "...--");
        alphabet.put("4", "....-");
        alphabet.put("5", ".....");
        alphabet.put("6", "-...");
        alphabet.put("7", "--...");
        alphabet.put("8", "---..");
        alphabet.put("9", "----.");
        alphabet.put("0", "-----");
        alphabet.put("?", "..--..");
        alphabet.put("!", "-.-.--");
        alphabet.put(".", ".-.-.-");
        alphabet.put(",", "--..--");
        alphabet.put(" ", " ");
    }

    private static String decodeLine(String line) {
        return cSplit.splitAsStream(line)
                .map(alphabet::get)
                .collect(Collectors.joining(""));
    }

    public static String encode(List<String> data) {
        return data.stream()
                .map(Morse::decodeLine)
                .collect(Collectors.joining("\n"));
    }
}
