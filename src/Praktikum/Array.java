package Praktikum;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String[] Mahasiswa = new String[100];
        int[] Nilai = new int [100];
        String tambah = "Y";
        String []Keterangan=new String[100];
        int i =0;
        int sum=0;
        do { 
            System.out.print("Masukan Nama Mahasiswa: ");
            Mahasiswa[i] = scanner.nextLine();
            System.out.print("Masukan Nilai Mahasiswa: ");
            Nilai[i] = scanner.nextInt();
            scanner.nextLine();
            if(Nilai[i]<=70){
                Keterangan[i] ="Tidak Lulus";
            }else{
                Keterangan[i] ="Lulus";
            }
            System.out.println("Tambah lagi? (Y/N)");
            tambah = scanner.nextLine().toLowerCase();
            sum = sum +Nilai[i];
            i++;
        } while (i<100 && tambah.equals("y"));
        System.out.println("Daftar Mahasiswa");
        System.out.println("No\t"+"Nama\t"+"Nilai\t"+"Keterangan\t");

        for (int j = 0 ; j < Mahasiswa.length; j++){
            if (Mahasiswa[j] == null) {
                break;
            }
            System.out.println((j+1)+"\t"  + Mahasiswa[j] +"\t" +Nilai[j] + "\t"+ Keterangan[j]);
        }
        double average = sum/i;
        System.out.println("Nilai total : " +sum);
        System.out.println("Rata rata : " +average);
    scanner.close();
    }
}
