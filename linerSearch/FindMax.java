public class FindMax {
    public static void main(String[] args) {
        // find max in the array
        int[] arr = { 10, 20, 30, 40, 50, 80, 70, 600, 50 };
        max(arr);
        min(arr);
    }

    static void max(int[] arr) {
        int valmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (valmax <= arr[i]) {
                valmax = arr[i];
            }
        }
        System.out.println("Max Num : " + valmax);
    }

    static void min(int[] arr){
        int valmin=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(valmin >= arr[i]){
                valmin=arr[i];
            }

        }
        System.out.println( "Min Num : " + valmin);
    }
}
