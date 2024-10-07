import java.util.Scanner;
public class Lulus {
    public static void main(String[] args) throws Exception {
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukan nilai anda: ");
        double nilai = angka.nextDouble();

        if (nilai > 75)
        System.out.println("LULUS");

        else 
        System.out.println("TIDAK LULUS");
    }
}
