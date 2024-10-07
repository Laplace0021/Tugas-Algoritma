import java.util.Scanner;
/*Buatlah program untuk menghitung pecahan uang (100 ribuan, 50 ribuan, 20 ribuan, 10 ribuan, 5 ribuan, 2 ribuan, 1ribuan, 500, dan 100)
Contoh 57000
1 lembar 50 ribuan
1 lembar 5 ribuan
1 lembar 2 ribua */

public class Pecahanuang {
    public static void main(String[] args) throws  Exception {
        int uang, sisa, pemecah;
        Scanner rupiah = new Scanner(System.in);
        System.out.print("Masukan uang yang ingin anda pecah: ");
        uang = rupiah.nextInt();
        sisa =uang;
        
        if (sisa >= 100000) {
            pemecah = sisa / 100000;
            sisa = sisa % 100000;
            System.out.println(pemecah + " lembar 100 ribuan");
        }
        if (sisa >= 50000) {
            pemecah = sisa / 50000;
            sisa = sisa % 50000;
            System.out.println(pemecah + " lembar 50 ribuan");
        }
        if (sisa >= 20000) {
            pemecah = sisa / 20000;
            sisa = sisa % 20000;
            System.out.println(pemecah + " lembar 20 ribuan");
        }
        if (sisa >= 10000) {
            pemecah = sisa / 10000;
            sisa = sisa % 10000;
            System.out.println(pemecah + " lembar 10 ribuan");
        }
        if (sisa >= 5000) {
            pemecah = sisa / 5000;
            sisa = sisa % 5000;
            System.out.println(pemecah + " lembar 5 ribuan");
        }
        if (sisa >= 2000) {
            pemecah = sisa / 2000;
            sisa = sisa % 2000;
            System.out.println(pemecah + " lembar 2 ribuan");
        }
        if (sisa >= 1000) {
            pemecah = sisa / 1000;
            sisa = sisa % 1000;
            System.out.println(pemecah + " lembar 1 ribuan");
        }
        if (sisa >= 500) {
            pemecah = sisa / 500;
            sisa = sisa % 500;
            System.out.println(pemecah + " koin 500 an");
        }
        if (sisa >= 100) {
            pemecah = sisa / 100;
            sisa = sisa % 100;
            System.out.println(pemecah + " koin 100 an");
        }
        rupiah.close();
    }
}
