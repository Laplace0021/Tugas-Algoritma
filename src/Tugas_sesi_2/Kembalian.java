package Tugas_sesi_2;
import java.util.Scanner ;

public class Kembalian {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        float harga, jumlahTelur, totalBayar, uang, kembalian;
        harga = 28000;
        System.out.print("Masukan Jumlah Telur dalam KG ");
        jumlahTelur = inputan.nextFloat();
        totalBayar = jumlahTelur * harga;
        System.out.print("Berikan uang ");
        uang = inputan.nextFloat();
        kembalian = uang - totalBayar;
        System.out.println("Jumlah Telur(kg) : "+jumlahTelur+" Kilo");
        System.out.println("Total Bayar : "+totalBayar);
        System.out.println("Uang yang diberikan = " +uang);
        System.out.println("Uang kembalian : " +kembalian);

        inputan.close();
    }
}
