import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        double jarijari, keliling;
        System.out.print("Masukan Jari-Jari : ");
        jarijari = inputan.nextDouble();
        if (jarijari %7 == 0) {
            keliling = 2 * (22.0 / 7) * jarijari;
        } else {
            keliling = 2 * 3.14 * jarijari;
        }
        System.out.println("Keliling lingkaran dari jari jari tersebut adalah : " +keliling);
        inputan.close();
    }
}
