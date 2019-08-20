import java.util.Scanner;

public class Main {

    /**
     * Write a method that tests the given number is composite or not. The composite number is a positive integer that has at least one divisor other
     * than 1 and itself.
     * <p>
     * The method should return a value of the boolean type.
     */
    public static boolean isComposite(long number) {
        return number > 2 && number % 2 == 0 && number % (number / 2) == 0;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}