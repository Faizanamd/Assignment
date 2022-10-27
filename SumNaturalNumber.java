import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
