package golde.comet.assessment.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Character.isLetter;

public class DuplicateCharacterCounter {

    public static void main(String[] args) {
        String text = "This is a test string";
        countDuplicateCharacters(text);
    }

    public static void countDuplicateCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else if (isLetter(c)){
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' repeated " + entry.getValue() + " times.");
            }
        }
    }
}
