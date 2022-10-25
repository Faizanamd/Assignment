import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp  = num;

        while (num!= 0)
        {
            int rem  = num % 10;
            rev = rev*10 + rem;
            num/=10;
        }
        System.out.println(rev);
        if (temp == rev)
        {
            System.out.println(temp+ " is palindrome number");
        }
        else
        {
            System.out.println(temp+ " is not palindrome number" );

        }
    }
}
