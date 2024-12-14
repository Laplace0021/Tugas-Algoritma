package Tugas_sesi_10;
import java.util.Random;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int arr [] = {9,3,4,10,2,7,6,5,8,1};
        System.out.print("Angka yang dicari: ");
        int angka = sc.nextInt();
        int index= linearS(arr,angka);
    
        System.out.print(angka+" ada di Index "+index);
    }
    private static int linearS (int [] arr, int angka){
        for(int i = 0; i < arr.length; i++){
            if(angka==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
