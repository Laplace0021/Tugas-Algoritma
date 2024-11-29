package Tugas_sesi_9;
import java.util.Random;

public class insertionSort {
    public static void main(String[] args) {
        Random random = new Random();
//membuat array 
        int angka[] = new int[10]; 

//memberikan angka random untuk array
        for (int i= 0; i < angka.length; i++){
            angka[i] = random.nextInt(10); 
        }
//print
        System.out.println("Before: ");
        printout(angka);

        sort(angka);

        System.out.println("\nAfter: ");
        printout(angka);
    }

    private static void printout (int[] angka){
        for (int i : angka){
            System.out.print(i+" ");
        }
    }

    private static void sort (int [] angka){
        for (int i = 1; i < angka.length; i++){ //mulai dari index 1
            int temp = angka[i];                //membuat salinan sementara index i
            int j = i - 1;                      //membuat var sebelum i
            
//selama index lebih dari 0 dan angka sebelum i lebih besar dari i
            while (j>=0 && angka[j] > temp){    
                angka[j+1] = angka[j];   //
                j--;
            }
        angka[j+1] = temp; 
        }
    }
}
