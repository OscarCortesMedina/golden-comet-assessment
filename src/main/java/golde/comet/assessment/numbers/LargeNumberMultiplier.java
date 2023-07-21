package golde.comet.assessment.numbers;

public class LargeNumberMultiplier {

    public static void main(String[] args) {
        long num1 = Long.MAX_VALUE;
        long num2 = 1L;

        try{
            System.out.println(Math.multiplyExact(num1, num2));
        }catch (ArithmeticException e) {
            System.out.println("Overflow Exception");
        }
    }


}
