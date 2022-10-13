package tips;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapsFor {

    public static void main(String[] args) {
        int size = 5;
        HashMap<Integer, String> mapa = new HashMap<>();

        for (int i = 0; i <= size; i++) {
            mapa.put(i, UUID.randomUUID().toString());
        }

        for (Map.Entry<Integer, String> i : mapa.entrySet()) {
            Integer key = i.getKey();
            String value = i.getValue();

            System.out.println("Chave: " + key + ", Value: " + value);
        }
    }
}