package Tugas_sesi_5;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    Double nilai;

    public Mahasiswa(String nama, Double nilai){
        this.nama = nama;
        this.nilai = nilai;
        
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        String inputLagi = "y";
        Mahasiswa mhs [] = new Mahasiswa[100];
        String []status = new String[100]; 
        int i = 0;
        double sum=0;
        do { 
            System.out.print("Masukan Nama Mahasiswa: ");
            String namamhs = sc.nextLine();
            System.out.print("Masukan Nilai Mahasiswa: ");
            Double nilaimhs = sc.nextDouble();
            sc.nextLine();
            if (nilaimhs<=70)status[i]="TIDAK LULUS";
            else status[i]="LULUS";
            mhs[i] = new Mahasiswa(namamhs, nilaimhs);
            System.out.print("Tambah data mahasiswa lagi? (Y/N): ");
            inputLagi = sc.nextLine().toLowerCase();
            sum = sum + nilaimhs;
            i++;
        } while (i < mhs.length && inputLagi.equals("y"));

        System.out.println("Daftar Nilai Mahasiswa".toUpperCase());
        System.out.println("=".repeat(30));
        System.out.println("No\tNama\tNilai\tStatus\t");

        for (int j = 0; j < mhs.length; j++) {
            if(mhs[j] == null) break;
            System.out.println((j+1)+ ". \t" + mhs[j].nama + "\t" +mhs[j].nilai +"\t"+ status[j] );
        }
        System.out.println("=".repeat(30));
        System.out.println("Jumlah: " + sum);
        System.out.println("Nilai rata-rata: "+sum/i);
        
        sc.close();
    }
}
