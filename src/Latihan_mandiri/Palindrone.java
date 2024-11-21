package Latihan_mandiri;

import java.util.Scanner;
public class Palindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata/angka yang ingin anda cek: ");
        String kata = input.next();
        String reverse = "";

        for (int i = kata.length()-1; i >= 0; i--){
            reverse = reverse + kata.charAt(i);
        }
        if (kata.equals(reverse)){
            System.out.println("Palindrone");
        } else {
            System.out.println("bukan palindrone");
        }

    }
}
