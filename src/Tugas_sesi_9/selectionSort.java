package Tugas_sesi_9;

// import java.util.Random;

public class selectionSort {

    public static void main(String[] args) {
        // Random rand = new Random();
        // int[] angka = new int[10]; // membuat array

        // for (int i = 0; i < angka.length; i++) {
        //     angka[i] = rand.nextInt(100); // mengisi array dengan angka random
        // }
        
        int [] angka = {2,1,6,3,5,4};
        System.out.println("Before: ");
        print(angka);

        select(angka);

        System.out.println("\nAfter: ");
        print(angka);
    }

    private static void print(int[] angka) {
        for (int i : angka) {
            System.out.println(i + " ");
        }
    }

    private static void select(int[] angka) {
        for (int i = 0; i < angka.length-1; i++) {
            int current = i;
            for (int j = i+1; j < angka.length; j++) {
                if (angka[current] > angka[j]) {
                    current = j;
                }
            }
            int temp = angka[i];
            angka[i] = angka[current];
            angka[current] = temp;
        }
    }
}
