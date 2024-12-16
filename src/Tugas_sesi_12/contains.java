package Tugas_sesi_12;

public class contains {
    public static boolean contains(int[]arr, int n, int target){
        if (n==arr.length){
            return false;
        } else if(arr[n]==target){
            return true;
        }
        return contains(arr, n+1, target);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target = 1;
        boolean result = contains(arr, 0, target);
        System.out.println("Target ada di dalam array: "+result);
    }
}
