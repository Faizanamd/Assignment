import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int rev = 0;
        int rem;
        while (num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
