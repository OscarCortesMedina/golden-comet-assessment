package golde.comet.assessment.strings;

public class PalindromeValidator {

    public static void main(String[] args) {
        String text = "onos";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.toLowerCase().trim();
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversed);
    }
}
