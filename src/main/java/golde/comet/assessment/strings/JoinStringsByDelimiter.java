package golde.comet.assessment.strings;

public class JoinStringsByDelimiter {

    public static void main(String[] args) {
        String[] strings = {"This", "is", "a", "test", "string"};
        System.out.println(joinStringsByDelimiter(strings, ","));
    }

    public static String joinStringsByDelimiter(String[] strings, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strings.length;i++) {
            if (i < strings.length - 1){
                sb.append(strings[i]).append(delimiter);
            }else {
                sb.append(strings[i]);
            }
        }
        return sb.toString().trim();
    }
}
