import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose +-/* to perform operation");
        String str  = sc.next();
        char ch = str.charAt(0);

        switch (ch) {
            case '+' -> System.out.println("Sum of both number: " + (a + b));
            case '-' -> System.out.println("Subtraction of both number: " + (a - b));
            case '/' -> System.out.println("Division of both number: " + (a / b));
            case '*' -> System.out.println("Multiplication of both number: " + (a * b));
            default -> System.out.println("Wrong input");
        }

    }
}
