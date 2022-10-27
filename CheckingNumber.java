import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        int num  = new Scanner(System.in).nextInt();
        if (num>=0)
        {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
}
