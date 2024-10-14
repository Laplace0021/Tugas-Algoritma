package Tugas_sesi_3;
import java.util.Scanner;
public class Konversinilai {
    public static void main(String[] args) throws  Exception {
        Scanner inputangka = new Scanner(System.in);
        System.out.println("Masukan nilai anda");
        double nilai = inputangka.nextDouble();
/*A, jika nilai lebih dari 85
B, jika nilai lebih dari 75 dan kurang dari 85
C, jika nilai lebih dari 65 dan kurang dari 55
D, jika nilai lebih dari 55
sisanya E */

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 75 && nilai < 85) {
            System.out.println("B");
        } else if (nilai > 65 && nilai < 75) {
            System.out.println("C");
        } else if (nilai > 55) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
        inputangka.close();
    }
}
