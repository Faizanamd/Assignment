import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        for (int i = 0; i<str.length(); i++)
        {
            for (int j = i; j<str.length()-1; j++)
            {
                if(i != j) {
                    if (str.charAt(i) == str.charAt(j)) {
                        System.out.println(str.charAt(i));
                    }
                }
            }
        }
    }
}
