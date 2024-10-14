package Tugas_sesi_3;
import java.util.Scanner;
public class Jeruk {
    public static void main(String[] args) {
        Scanner jumlah = new Scanner(System.in);
        int jeruk, harga, beli, sisa, harga1, harga2, harga3;
        System.out.print("Jumlah jerung yang ingin anda beli: ");
        jeruk = jumlah.nextInt();
        sisa = jeruk;
        beli=0;
        harga1=0;
        harga2=0;
        harga3=0;
        if (sisa >= 5) {
            beli =sisa / 5;
            harga1 =beli* 10000;
            sisa = sisa % 5;
        }
        if (sisa >=2) {
            beli = sisa/ 2;
            harga2 =beli * 5000;
            sisa = sisa %2;
        }
        if (sisa == 1) {
            harga3 = sisa * 3000;
        }
        harga = harga1 + harga2 + harga3;
        System.out.println("Total uang yang anda bayar adalah: " +harga);
    }
}
