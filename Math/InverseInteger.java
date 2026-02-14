package Math;
public class InverseInteger {
     public int reverse(int x) {
       int rev = 0;
       boolean flag = true;
       if (x < 0) {
          flag = false;
          x *= -1;
       }
 
       while(x > 0) {
          int digit = x % 10;
          x /= 10;
          if (rev > Integer.MAX_VALUE/10) {
             return 0;
          }
 
          rev = rev * 10 + digit;
       }
 
       if (flag == false) 
          return rev * -1;
        else 
          return rev;
    }
 
    public static void main(String[] var0) {
       InverseInteger x = new InverseInteger();
       System.out.println(x.reverse(123));
       System.out.println(x.reverse(-456));
       System.out.println(x.reverse(1000000003));
    }
}
