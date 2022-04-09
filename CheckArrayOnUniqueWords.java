package collectionPractice;

import java.util.*;

public class CheckArrayOnUniqueWords {

    public static void main(String[] args) {
        Map<Integer, String> map = createArrayWords();

        Set<String> set = new HashSet<>(map.values());

        counterAndPrintWords(map, set);


    }

    private static void counterAndPrintWords(Map<Integer, String> map, Set<String> set) {
        int count = 0;
        int res = 0;
        boolean flag;
        List<String> listUniqueWords = new ArrayList<>();
        for (String s : set) {
            for (String value : map.values()) {
                flag = value.contains(s);
                if (flag) {
                    res = ++count;
                }
            }
            System.out.println("Слово '" + s + "' встретилось " + res + " раз(а)");
            count = 0;
            if (res == 1) listUniqueWords.add(s);
        }
        System.out.println("\nСписок уникальных слов = " + listUniqueWords);
    }

    private static Map<Integer, String> createArrayWords() {
        Map<Integer, String> map = new HashMap<>();
        map.put(13, "January");
        map.put(14, "January");
        map.put(1, "January");
        map.put(16, "January");
        map.put(2, "March");
        map.put(3, "March");
        map.put(4, "March");
        map.put(5, "February");
        map.put(15, "February");
        map.put(6, "May");
        map.put(7, "March");
        map.put(17, "Julie");
        map.put(8, "January");
        map.put(9, "April");
        map.put(10, "May");
        map.put(11, "June");
        map.put(12, "May");
        return map;
    }

}
