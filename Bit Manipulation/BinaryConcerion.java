public class BinaryConcerion {
    public static void main(String[] args) {
        int n = 25;
        CustomMethod(n);
        Builtin(n);
    }
    public static void CustomMethod(int n){
        StringBuilder binary = new StringBuilder();
        while(n > 0){
            binary.insert(0,n % 2);
            n = n / 2;
        }
        System.out.println("Binary of 25 is: " + binary);
    }
    public static void Builtin(int n){
        String binary = Integer.toBinaryString(n);
        System.err.println("Binary of "+ n + " is: " + binary);;
    }
}
