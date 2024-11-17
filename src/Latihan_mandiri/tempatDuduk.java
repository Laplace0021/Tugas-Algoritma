package Latihan_mandiri;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tempatDuduk {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map kursi = new HashMap(5);
    do {
        System.out.print("Nomor Kursi: ");
        int nomor = sc.nextInt();
        sc.nextLine();
        if (!kursi.containsKey(nomor)){
            System.out.print("Atas nama: ");
            String nama = sc.nextLine();
            if (!kursi.containsValue(nama)){
                kursi.put(nomor, nama);
            } else {
                System.out.println(nama+" sudah mempunyai tempat duduk");
            }
        } else {
            System.out.println("Kursi sudah ditempati");
        }
    }while (kursi.size() < 5);
    System.out.println("Kursi sudah penuh");
    System.out.println(kursi);
    }
}
