import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        if (j>=0) {
            for (int n = 0; n <= j; n++) {
                if (n == 1 || n ==2) {
                    System.out.println(n+" is  a prime Number");

                }
                else if (n == 0)
                {
                    System.out.println("0 is not a prime Number");}
                else {
               int var  = 0;
                    int i;
                    for ( i = 2; i < n; i++) {
                        if (n % i == 0) { var++;  } }

                if (var == 0) {
                    System.out.println(i + " is a prime Number");
                } else {
                    System.out.println(i + " is not a prime Number");
                }
                }
            }
        }
        else System.out.println("Enter a valid number");

    }
}
