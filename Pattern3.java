import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        char ch = 'A';
        int x = 0;
       for (int i = 0; i<num; i++)
       {
           for (int j = 0; j<=i; j++)
           {
               System.out.print((char) (ch+x)+" ");
               x++;
           }
           System.out.println();

       }
    }
}

