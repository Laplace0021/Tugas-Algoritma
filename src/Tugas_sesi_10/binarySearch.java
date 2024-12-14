package Tugas_sesi_10;
public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,8,9,12,16,19,20,27,38,39,40,49,58,60};
        int target = 58;
        int index = binaryS(arr, target);
        if (index!=-1){
            System.out.println("Target berada di index "+index);
        } else {
            System.out.println("Target tidak ditemukan");
        }
    }
    private static int binaryS(int[] arr, int target) {
    int left = 0;
    int right = arr.length-1;
    while (left<=right){
        int mid = (left+right)/2;

        if (arr[mid]==target){
            return mid;
        } else if(arr[mid]<target){
            left = mid+1;
        } else {
            right = mid-1;
        }
    }
    return -1;
    }
    
}
