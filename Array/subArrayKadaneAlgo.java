
public class subArrayKadaneAlgo {
    public static void KadaneAlgo(int[] arr){
        int maxSoFar = arr[0];
        int maxEndHere = arr[0];
        int start = 0, end = 0, s = 0;
        for(int i = 1; i < arr.length; i++){

            if(arr[i] > arr[i] + maxEndHere){
                maxEndHere = arr[i];
                s = i;
            } else{
                maxEndHere += arr[i];
            }
            if(maxEndHere > maxSoFar){
                maxSoFar = maxEndHere;
                start = s;
                end = i;
            }
            // maxEndHere = Math.max(arr[i], maxEndHere + arr[i]);
            // maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        System.out.println("Maximum subArray sum is : " + maxSoFar);
        System.out.println("SubArrays sum: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,-5,6,7};
        KadaneAlgo(arr);
    }
}
