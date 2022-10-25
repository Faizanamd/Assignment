import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Taking user input using scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a+" is the largest Number");
            if(b>c)
            {
                System.out.println(b+" is second largest Number");
                System.out.println(c+" is the smallest Number");
            }
            else
            {
                System.out.println(c+" is second largest Number");
                System.out.println(b+" is the smallest Number");
            }

        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is the largest Number");
            if(a>c)
            {
                System.out.println(a+" is second largest Number");
                System.out.println(c+" is the smallest Number");
            }
            else
            {
                System.out.println(c+" is second largest Number");
                System.out.println(a+" is the smallest Number");
            }

        }

        else
        {
            System.out.println(c+" is the largest Number");
            if(a>b) {
                System.out.println(a + " is second largest Number");
                System.out.println(b + " is the smallest Number");
            }
            else
            {
                System.out.println(b + " is second largest Number");
                System.out.println(a + " is the smallest Number");
            }
        }
    }
}
