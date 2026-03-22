import java.util.Arrays;

public class subArray {
    public static void subArr(int[] arr){
        int n = arr.length;
        int a = 1;
        int b = 4;

        int[] sub = Arrays.copyOfRange(arr, a, b);
        System.out.println(Arrays.toString(sub));

        int[] subMannul = new int[b-a];
        for(int i = a; i < b; i ++){
            subMannul[i - a] = arr[i];
        }
        System.out.println(Arrays.toString(subMannul));
    }
    public static int allSubArr(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                }
                count++;
                System.out.println();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2 ,3,4,5};
        subArr(arr);
        System.out.println("All possible arrays count : " + allSubArr(arr));
    }
}
