package Tugas_sesi_9;

import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] angka = new int[100000];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = rand.nextInt(10000);
        }
        System.out.println("Before: ");
        print(angka);

        bubble(angka);
        System.out.println("\nafter: ");
        print(angka);
    }

    private static void print(int[] angka) {
        for (int i : angka) {
            System.out.println(i + " ");
        }
    }

    private static void bubble(int[] angka) {

        for (int k = 0; k <angka.length-1; k++) {
            boolean sorted = false;
            for (int j = 1; j < angka.length-k; j++) {
                int i = j - 1;
                if (angka[i] > angka[j]) {
                    int temp = angka[j];
                    angka[j] = angka[i];
                    angka[i] = temp;
                    sorted =true;
                }

            }
           if(sorted==false) break;
        }
    }
}
