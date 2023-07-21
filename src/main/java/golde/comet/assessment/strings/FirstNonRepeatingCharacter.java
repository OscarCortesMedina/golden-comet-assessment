package golde.comet.assessment.strings;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String text = "This is a test string";
        System.out.println(firstNonRepeatingCharacter(text));
    }

    public static char firstNonRepeatingCharacter(String str) {

        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return ' ';

    }
}
