public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int result = a / b;
            System.out.println("Result: " + result);

            try {
                int[] numbers = new int[5];
                numbers[10] = 50; // Will cause ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException caught: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: ArithmeticException caught: " + e);
        } finally {
            System.out.println("Finally block executed in nested try example.");
        }
    }
}
