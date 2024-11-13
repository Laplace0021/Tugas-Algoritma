package Praktikum;
import java.util.Scanner;

public class Latihankembalian {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner (System.in);

        System.out.print("Masukan jumlah beli ");
        int jumlahBeli = inputan.nextInt();

        System.out.print("Masukan harga perkilo ");        
        int hargaPerkilo = inputan.nextInt();

        System.out.print("Masukan uang yang diberikan ");
        int uang = inputan.nextInt() ;
        int bayar = jumlahBeli*hargaPerkilo;
        int kembalian = uang-bayar;

        System.out.println("Jumlah yang dibeli " +jumlahBeli+ " KG");
        System.out.println("Total yang harus dibayar " +bayar);
        System.out.println("Uang yang diberikan " +uang);
        System.out.println("Uang kembalian " +kembalian);

        inputan.close();        
    }
    
}
