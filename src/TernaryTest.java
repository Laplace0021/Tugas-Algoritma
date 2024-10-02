import java.util.Scanner;
// Status barang terbeli atau tidak
public class TernaryTest {
    public static void main(String[] args)throws Exception{
    Scanner inputan = new Scanner(System.in);
    System.out.print("Masukan jumlah uang yang kamu bawa : ");
    double Uang = inputan.nextDouble();
    System.out.print("Masukan total harga barang : ");
    double harga = inputan.nextDouble();
    String status = (Uang > harga) ? "Barang terbeli." : "Uang tidak cukup, silakan kembali lagi." ;
    System.out.println(status);
    inputan.close();
    }
}
