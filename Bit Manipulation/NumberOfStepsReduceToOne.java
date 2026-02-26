public class NumberOfStepsReduceToOne {
    public static int numSteps(String s){
        int steps = 0;
        int carry = 0;

        for(int i = s.length() - 1; i > 0; i--){
            int digit = s.charAt(i) - '0';
            if(digit + carry == 1){
                // To determine odd and even ,If last bits is (carry + digit) = 1, then its odd;
                // If last bit (carry + digit) = (0, 2) , then its even;
                steps += 2;
                carry = 1;
            } else {
                steps += 1;
            }
        }
        return steps + carry;
    }
    public static void main(String[] args) {
        String s = "10";
        System.out.println(numSteps(s));
    }
}
