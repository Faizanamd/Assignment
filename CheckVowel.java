import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {   System.out.println(ch + " is vowel" );   }
        else
        {    System.out.println(ch + " is consonant");  }
    }
}
