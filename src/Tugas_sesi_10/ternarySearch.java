package Tugas_sesi_10;

public class ternarySearch {
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 7, 9, 12, 14, 16, 19, 21, 23, 26, 28, 29, 30, 32, 36, 38, 39, 41, 44, 46};
        int target = 3;
        int result = Search(arr, target);
        if (result!=-1){
            System.out.println("Target ada di index "+result);
        } else{
            System.out.println("Target tidak ada di dalam array");
        }
    }
    public static int Search(int [] arr, int target){
        int kiri=0;
        int kanan= arr.length-1;
        while(kiri<=kanan){
            int mid1= kiri+(kanan-kiri)/3;
            int mid2 = kanan-(kanan-kiri)/3;
            if (arr[mid1]==target){
                return mid1;
            } else if(arr[mid2]==target){
                return mid2;
            } else if(target<arr[mid1]){
                kanan=mid1-1;
            } else if(target>arr[mid1]&&target<arr[mid2]){
                kanan=mid2-1;
                kiri=mid1+1;
            } else if(target>arr[mid2]){
                kiri=mid2+1;
            } 
        }
        return -1;
    }
}
