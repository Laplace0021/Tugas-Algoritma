package Latihan_mandiri;
import java.util.Scanner;

public class Mafiaidentifycheck {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        // Data diri start

        System.out.println("Masukan data diri anda:");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Umur: ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Tempat tinggal: ");
        String domisili = input.nextLine();        
        System.out.print("Tabungan anda($):");
        int tabungan = input.nextInt();
        domisili = domisili.toLowerCase();
        //Data diri end

        // Persyaratan Start

        if ((umur>40) && ((domisili.equals ("nevada"))||(domisili.equals ("new york"))||(domisili.equals ("havana"))) && (tabungan > 10000000) ) {
            System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat Don");
        }else if((umur>=25) && ((domisili.equals ("new jersey"))||(domisili.equals ("manhattan"))||(domisili.equals ("nevada"))) && (tabungan <=2000000)){
            System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat Underboss");
        }else if ((umur>=18) && ((domisili.equals ("california"))||(domisili.equals ("detroit"))||(domisili.equals ("boston"))) && (tabungan < 1000000)) {
            System.out.println(nama+" kemungkinan adalah seorang anggota mafia dengan pangkat Capo");
        }else{
            System.out.println(nama+" tidak mencurigakan");
        }

        input.close();
    }   
}
