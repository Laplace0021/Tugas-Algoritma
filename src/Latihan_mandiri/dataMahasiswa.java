package Latihan_mandiri;

import java.util.ArrayList;
import java.util.Scanner;

public class dataMahasiswa {
    static ArrayList<String> matkul = new ArrayList<>();
    static ArrayList<Integer> sks = new ArrayList<>();
    static ArrayList<String> nilai = new ArrayList<>();
    static ArrayList<Integer> bobotL = new ArrayList<>();
    static int jumlahSKS = 0;
    static double sumIP = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Mahasiswa:  ");
        String nama = sc.nextLine();
        System.out.print("Semester : ");
        int semester = sc.nextInt();
        sc.nextLine();
        String inputLagi = "y";
        int bobot=0;
        do { 
            System.out.print("Mata Kuliah: ");
            String mataKuliah = sc.nextLine();
            System.out.print("SKS: ");
            int matkulSks = sc.nextInt();
            sc.nextLine();
            System.out.print("Nilai: ");
            String matkulNilai = sc.nextLine().toUpperCase();
            switch (matkulNilai) {
                case "A":
                    bobot = 4;
                    break;
                case "B":
                    bobot = 3;
                    break;
                case "C":
                    bobot = 2;
                    break;
                case "D":
                    bobot = 1;
                    break;
                case "E":
                    bobot = 0;
                    break;
                default:
                    System.out.println("Bobot tidak ada");
            }
            sumIP = sumIP + (bobot*matkulSks);
        jumlahSKS =jumlahSKS +matkulSks;
        matkul.add(mataKuliah);
        sks.add(matkulSks);
        nilai.add(matkulNilai);
        bobotL.add(bobot);
        System.out.print("Input data lagi? (y/n): ");
        inputLagi = sc.next().toLowerCase();
        } while (inputLagi.equals("y"));
        System.out.println("=".repeat(75));
        System.out.println("Nama\t\t: "+ nama);
        System.out.println("Semester\t: "+ semester);
        System.out.println("=".repeat(75));
        System.out.printf("%-5s %15s %10s  %-10s %10s%n","No.","Mata Kuliah", "SKS","Bobot", "Nilai");
        for (int i = 0 ; i < matkul.size(); i++){
            String mataKuliah = matkul.get(i);
            int matkulSks = sks.get(i);
            String matkulNilai = nilai.get(i);
            bobot = bobotL.get(i);
            System.out.printf("%-5d %-22s %-8s  %-15s %-5s%n", i+1, mataKuliah, matkulSks, bobot, matkulNilai);
        }
        
        System.out.println("=".repeat(75));
        double averIP = sumIP/jumlahSKS;
        System.out.println("Jumlah SKS: " + jumlahSKS);
        System.out.println("IP semester: " + averIP);
        System.out.println("Jumlah SKS yang bisa diambil semester depan: 24");
        sc.close();
    }
}
