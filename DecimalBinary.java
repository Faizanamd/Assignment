import java.util.Scanner;
public class DecimalBinary
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int sum  = 0 ;
        int pv  =1;
        while (num> 0)
        {
            int rem = num%2;
            sum = sum + rem*pv;
            pv= pv*10;
            num/=2;
        }
        System.out.println(sum);
    }
}