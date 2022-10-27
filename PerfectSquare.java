import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Hellp");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int area = height*width;
        if (area == height*height && area == width*width)
        {
            System.out.println("Perfect Square");
        }
        else System.out.println("Not a perfect square");
    }
}
