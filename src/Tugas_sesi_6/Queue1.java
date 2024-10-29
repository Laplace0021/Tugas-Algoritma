package Tugas_sesi_6;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
    static Queue<String> nama = new LinkedList<>();
    static Queue<Double> nilai = new LinkedList<>();
    static Queue<String> status = new LinkedList<>();
    static double sum = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputlagi = "y";
        String statusM ;
        do{
        System.out.print("Masukan nama mahasiswa: ");
        String namaM = input.nextLine();
        System.out.print("Masukan nilai mahasiswa: ");
        Double nilaiM = input.nextDouble();
        input.nextLine();
            if (nilaiM >= 75){
                statusM = "Lulus";
            } else {
                statusM = "Tidak Lulus";
            }
            nama.add(namaM);
            nilai.add(nilaiM);
            status.add(statusM);
            sum = sum +nilaiM;
        System.out.print("Masukan data mahasiswa lagi? (y/n): ");
        inputlagi = input.nextLine();

        } while(inputlagi.equals("y"));
        System.out.println("Data Mahasiswa");
        System.out.println("=".repeat(57));
        int a = nama.size();
        System.out.printf("%-5s %-30S %-8s %-11s %n","No.","Nama","Nilai","Status");
        for (int i = 0; i<a;i++){
            String namaM = nama.poll();
            double nilaiM = nilai.poll();
            statusM = status.poll();
            
            System.out.printf("%-5d %-30s %-8s %-11s %n",i+1,namaM,nilaiM,statusM);
        }
        System.out.println("=".repeat(57));
        System.out.println("Jumlah nilai: "+sum);
        double average = sum / a;
        System.out.println("Rata-rata nilai: " + average);
        input.close();
    }
}

