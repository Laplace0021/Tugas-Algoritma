package Tugas_sesi_6;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {


    // Stack Dir
    static Stack<String> nama = new Stack<>();
    static Stack<Integer> nilai = new Stack<>();
    static Stack<String> status = new Stack<>();
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
            nama.push(namamhs);
            nilai.push(nilaimhs);
            status.push(statusmhs);
            sum = sum+nilaimhs;
            System.out.print("Tambah data mahasiswa? (y/n) : ");
            inputlagi = input.nextLine().toLowerCase();
        } while (inputlagi.equals("y"));
        System.out.println("Data Mahasiswa");
        System.out.println("=".repeat(57));
        int a = nama.size();
        System.out.printf("%-5s %-30S %-8s %-11s %n","No.","Nama","Nilai","Status");
        for (int i = 0; i<a;i++){
            String namaM = nama.pop();
            int nilaiM = nilai.pop();
            String statusM = status.pop();
            
            System.out.printf("%-5d %-30s %-8d %-11s %n",i+1,namaM,nilaiM,statusM);
        }
        System.out.println("=".repeat(57));
        System.out.println("Jumlah nilai: "+sum);
        double average = sum / a;
        System.out.println("Rata-rata nilai: " + average);
        input.close();
    }

}
