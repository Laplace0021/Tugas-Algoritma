package Tugas_sesi_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    // ArrayList Dir
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Integer> nilai = new ArrayList<>();
    static ArrayList<String> status = new ArrayList<>();
    static int sum = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputlagi = "y";
        String statusmhs ;
        do { 
            System.out.print("Masukan nama mahasiswa : ");
            String namamhs = input.nextLine();
            System.out.print("Masukan nilai mahasiswa : ");
            int nilaimhs = input.nextInt();
            input.nextLine();
            if (nilaimhs >= 75) {
            statusmhs = "Lulus";
            }else {
             statusmhs = "Tidak Lulus";
            }
            nama.add(namamhs);
            nilai.add(nilaimhs);
            status.add(statusmhs);
            sum = sum+nilaimhs;
            System.out.print("Tambah data mahasiswa? (y/n) : ");
            inputlagi = input.nextLine().toLowerCase();
        } while (inputlagi.equals("y"));
        System.out.println("Data Mahasiswa");
        System.out.println("=".repeat(57));
        
        System.out.printf("%-5s %-30S %-8s %-11s %n","No.","Nama","Nilai","Status");
        for (int i = 0; i<nama.size();i++){
            String namaM = nama.get(i);
            int nilaiM = nilai.get(i);
            String statusM = status.get(i);

            System.out.printf("%-5d %-30s %-8d %-11s %n",i+1,namaM,nilaiM,statusM);
        }
        System.out.println("=".repeat(57));
        System.out.println("Jumlah nilai: "+sum);
        double average = sum / nama.size();
        System.out.println("Rata-rata nilai: " + average);
        input.close();
    }

}
