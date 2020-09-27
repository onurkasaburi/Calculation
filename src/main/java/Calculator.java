public class Calculator {
    public static int sum(int first, int second) {
        return (first + second);
    }

    public static int minus(int first, int second) {
        return (first - second);
    }

    public static int multiply(int first, int second) {
        return (first * second);
    }

    public static int divide(int first, int second) {
        try {
            return (first / second);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divided by 0");
        }


    }
}
