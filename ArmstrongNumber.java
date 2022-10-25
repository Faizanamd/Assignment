import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

            int length = 0;
            int temp1 = num;
            while(temp1!= 0)
            {
                length++;
                temp1 = temp1 / 10;
            }

            int temp2 = num;
            int rev = 0;
            int rem ;
            while(temp2 != 0)
            {
                int tempRev = 1;
                rem = temp2%10;
                for (int i = 0; i<length; i++)
                {
                    tempRev = tempRev * rem;
                }
                rev = rev + tempRev;
                temp2 = temp2/10;
            }
           if(num == rev)
           {
               System.out.println(num+" is a armstrong number");
           }
        else System.out.println(num+" is not a armstrong number");
    }
}
