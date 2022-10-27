import java.util.Scanner;

public class AverageOf6Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 subject marks: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int sub6 = sc.nextInt();
        System.out.println("Average of 6 sub is : "+(sub1+sub2+sub3+sub4+sub5+sub6)/6);
    }
}
