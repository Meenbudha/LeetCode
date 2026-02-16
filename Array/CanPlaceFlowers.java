class CanPlaceFlowers {
    public static boolean PlaceFlowers(int[] flowerbed, int n) {
        for(int i=0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty = (i == 0) || (flowerbed[i-1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    n--;
                    if(n == 0) return true;
                }
            }
        }
        return n<=0;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        if(PlaceFlowers(flowerbed, n)){
            System.out.println("Can place");
        } else
            System.out.println("Cannot place");
    }
}