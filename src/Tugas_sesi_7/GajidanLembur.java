package Tugas_sesi_7;
import java.util.Scanner;

public class GajidanLembur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program penghitung total gaji");
        System.out.print("Masukan gaji anda: ");
        int gaji = sc.nextInt();
        System.out.print("Masukan total lembur(jam): ");
        int jamLembur = sc.nextInt();
        int lemburLebih  = 0;
        if (jamLembur>4){
            lemburLebih = jamLembur - 4;
            jamLembur = 4;
        }

        int UpahLembur = (int) Math.ceil(gaji/173);
        int totalGaji = gaji + (jamLembur*UpahLembur) + (lemburLebih*2*UpahLembur);
        System.out.println("Total Gaji: "+totalGaji);
        sc.close();
    }    
}
