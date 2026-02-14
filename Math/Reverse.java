package Math;
import java.util.*;

public class Reverse{

    public static int reverse(int x){
        int rem;
        int rev = 0;
        boolean flag = true;
        if(x < 0) {
            flag = false;
            x *= -1;
        }
        while(x > 0) {
            rem = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10){
                return 0;
            }

            rev = rev * 10 + rem;
        }
        if (flag == false)
            return rev * -1;
        else
            return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reversed number : "+result);

    }
}