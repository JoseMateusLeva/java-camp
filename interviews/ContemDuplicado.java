package interviews;

import java.util.HashMap;

public class ContemDuplicado {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{12, 2, 1, 212, 12}));
    }

    public static boolean containsDuplicate(int[] nums) {

        // HashMap trabalha com o conceito de key-value pairs, ou seja, cada elemento de sua lista possui uma chave e
        // valor associado, assim podemos realizar uma busca rápida pela chave que desejamos, sem precisar percorrer
        // toda lista ou saber o index/posição que desejamos consultar.

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                return true;
            } else {
                map.put(i, 1);
            }
        }

        return false;
    }
}