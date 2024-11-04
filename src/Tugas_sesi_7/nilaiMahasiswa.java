package Tugas_sesi_7;
import java.util.ArrayList;
import java.util.Scanner;

public class nilaiMahasiswa {
 static ArrayList<String> matkul = new ArrayList<>();
 static ArrayList<Integer> sks = new ArrayList<>();
 static ArrayList<Integer> nilai = new ArrayList<>();
 static ArrayList<String> Hmutu = new ArrayList<>();
 static ArrayList<Double> Hbobot =new ArrayList<>();
 static  int jumlahSKS= 0;
 static double sumIP =0;

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Transkrip Nilai");
    System.out.print("Nama Mahasiswa:  ");
    String nama = sc.nextLine();
    System.out.print("Semester : ");
    int semester = sc.nextInt();
    sc.nextLine();
    String inputLagi = "y";
    double bobot =0.0;
    String mutu= "E";
    do { 
        System.out.print("Mata Kuliah: ");
        String mataKuliah = sc.nextLine();
        System.out.print("SKS: ");
        int matkulSks = sc.nextInt();
        sc.nextLine();
        System.out.print("Nilai: ");
        int matkulNilai = sc.nextInt();
        sc.nextLine();
        if (matkulNilai <= 40){
            bobot = 0.0;
            mutu = "E";
        }else if (matkulNilai <=50) {
            bobot = 1.00;
            mutu = "D";
        }else if (matkulNilai <=54) {
            bobot = 1.70;
            mutu = "C-";
        }else if (matkulNilai <=59) {
            bobot = 2.00;
            mutu = "C";
        }else if (matkulNilai <=64) {
            bobot = 2.30;
            mutu = "C+";
        }else if (matkulNilai <=69) {
            bobot = 2.70;
            mutu = "B-";
        }else if (matkulNilai <=74) {
            bobot = 3.00;
            mutu = "B";
        }else if (matkulNilai <=79) {
            bobot = 3.30;
            mutu = "B+";
        }else if (matkulNilai <=84) {
            bobot = 3.70;
            mutu = "A-";
        }else if (matkulNilai >=85) {
            bobot = 4.00;
            mutu = "A";
        }
        sumIP = sumIP + (bobot*matkulSks);
        jumlahSKS =jumlahSKS +matkulSks;
        matkul.add(mataKuliah);
        sks.add(matkulSks);
        nilai.add(matkulNilai);
        Hmutu.add(mutu);
        Hbobot.add(bobot);
        
        System.out.print("Input data lagi? (y/n): ");
        inputLagi = sc.nextLine().toLowerCase();
    } while (inputLagi.equals("y"));
    System.out.println("=".repeat(75));
    System.out.println("Nama\t\t: "+ nama);
    System.out.println("Semester\t: "+ semester);
    System.out.println("=".repeat(75));
    System.out.printf("%-5s %15s %10s %-20s %-10s %10s%n","No.","Mata Kuliah", "SKS","Huruf Mutu","Bobot", "Nilai");
    for (int i = 0 ; i < matkul.size(); i++){
        String mataKuliah = matkul.get(i);
        int matkulSks = sks.get(i);
        int matkulNilai = nilai.get(i);
        bobot = Hbobot.get(i);
        mutu = Hmutu.get(i);
        System.out.printf("%-5d %-22s %-8s %-15s %-15s %-5s%n", i+1, mataKuliah, matkulSks, mutu, bobot, matkulNilai);
    }
    
    System.out.println("=".repeat(75));
    double averIP = sumIP/jumlahSKS;
    System.out.println("Jumlah SKS: " + jumlahSKS);
    System.out.println("IP semester: " + averIP);
    System.out.println("Jumlah SKS yang bisa diambil semester depan: 24");
    sc.close();
 }
}

