package Latihan_mandiri;

import java.util.Random;

public class binarySo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] angka = new int[100]; //membuat array

        for (int i = 0 ; i < angka.length; i++){
            angka[i] = rand.nextInt(1000); //mengisi array dengan angka random
        }

        System.out.println("Before: ");
        print(angka);

        divided(angka);

        System.out.println("\nAfter: ");
        print(angka);
    }

    private static void print(int [] angka){
        for(int i : angka){
            System.out.println(i+" ");
        }
    }

    private static void divided(int []angka){
        int length = angka.length;
        if ( length < 2) return; //jika angka hanya kurang dari 2, tidak perlu di sort

        int midIndex = length/2;        //membuat mid index
        int leftHalf[] = new int [midIndex];    //membuat bagian kiri array sebesar ukuran mid index
        int rightHalf[] = new int [length-midIndex]; // bagian kanan sebesar panjang array - besar mid index

        for (int i=0; i < midIndex; i++){  //i= 0 sampai midIndex-1
            leftHalf[i] = angka[i]; 
        }

        for (int i=midIndex; i < length ; i++){ // i = midIndex sampai akhir array
            rightHalf[i - midIndex] = angka[i];
        }

//rekursif keduanya sampai hanya tersisa 1 angka
        divided(leftHalf);
        divided(rightHalf);
//disort kemudia di merge
        merge(angka, leftHalf, rightHalf);
    }

    private static void merge(int[] angka, int [] leftHalf, int [] rightHalf){
        int leftsize = leftHalf.length;
        int rightsize = rightHalf.length;
// i= kiri, j= kanan, k =index angka[] yang telah di sort
        int i = 0, j = 0 ,k = 0; 
        while (i < leftsize && j < rightsize){
            if (leftHalf[i] <= rightHalf[j]){  
                angka[k] = leftHalf[i]; 
                i++;                    //increment agar lanjut membandingkan [j] dengan [i] yang baru 
            } else {
                angka[k] = rightHalf[j]; //jika rightHalf[j] < leftHalf[i]
                j++;                    //increment aagr lanjut membandingkan [i] dengan [j] yang baru
            }
            k++;    // k increment untuk mengisi angka[] setelahnya
        }
        //karena prosesnya mengeliminasi angka terkecil, maka akan menyisakan angka yang lebih besar.
        //karenanya, kita cek bagian mana yang tersisa, lalu masukan kedalam angka[]

        while ( i < leftsize){
            angka[k] = leftHalf[i];
            i++;
            k++;
        }
        while ( j < rightsize){
            angka[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    
}

