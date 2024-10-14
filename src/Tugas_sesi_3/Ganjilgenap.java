package Tugas_sesi_3;

import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) throws Exception {
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int hasil = angka.nextInt();
        int kondisi = hasil % 2;
        if (kondisi == 1 || kondisi == -1) {
            System.out.println(hasil + " adalah angka ganjil");
        } else {
            System.out.println(hasil+" adalah angka genap");
        }
        angka.close();
    }
    
}
