package Latihan_mandiri;
import java.util.Scanner;
public class Nomorpunggung {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor punggung: ");
        String posisi, keterangan;
        int nomor = input.nextInt();
        keterangan = "";
        posisi="";
        int keeper1 = nomor%3;
        int keeper2 = nomor%5;
        int genap= nomor %2;
        if (genap == 0){
            posisi = "Targer Attacker";
            if (nomor >= 50){
                keterangan = " dan berhak menjadi Captain Team";
            } 
            System.out.println("Nomor punggung "+nomor+" adalah seorang "+posisi+keterangan);
        } else if (genap == 1){
            posisi = "Defender";
            if (nomor > 90){
                posisi ="Playmaker";
            }else if ((keeper1==0)&&(keeper2==0) ){
                posisi = "Keeper";
            }
            System.out.println("Nomor punggung "+nomor+" adalah seorang "+posisi+keterangan);
        }

        
        input.close();
    }
}
