package Latihan_mandiri;
/* ALGORITMA
 *  MASUKAN INPUT
 * DIBAGI 2
 * CARI PANJANG STRING
 * WHILE I <=STRING
 * IF
 */

import java.util.Scanner;
public class Palindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata/angka yang ingin anda cek: ");
        String kata = input.next();
        int i = 1;
        StringBuilder sb = new StringBuilder(kata);
        String reversed = sb.reverse().toString();
        int a= kata.length()/2;
        int limit = a;
        if (kata.length()%2==1){
            
        }

    }
}
