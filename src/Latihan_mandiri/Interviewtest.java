package Latihan_mandiri;
import java.util.Scanner;
public class Interviewtest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nilai,a,b;
        System.out.print("Nilai test coding: ");
        nilai = input.nextInt();
        System.out.print("Nilai test wawancara: ");
        String hasil = input.next();
        hasil= hasil.toUpperCase();
       if (nilai>80){
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        }else if (nilai >=60){
            if (hasil.equals("A") || hasil.equals("B")){
                System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
            }else{
                System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
            }
        }else{
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
        input.close();
    }
}
