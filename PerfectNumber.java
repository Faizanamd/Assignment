
// Perfect Number
// 6 = 1+2+3(factor sum)

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int n = 0; n<j; n++)
        {
                int perNum = 0;
                if(n == 0)
                {  System.out.println(n+" is not a perfect number");   }
                else {
                        for (int i = 1; i < n; i++) {
                            if (n % i == 0) {
                                perNum = perNum + i;
                            }
                        }
                        if (n == perNum) {
                            System.out.println(n + " is perfect Number");
                        }
                        else {
                            System.out.println(n + " is not a perfect number");
                        }
                }
        }
    }
}
