import java.util.Scanner;
public class Disneyislandentry {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        int umur;
        int tarif;
        double tinggi;
        System.out.print("Usia anda: ");
        umur = input.nextInt();
        
        tarif=0;
        if (umur <=1){
            System.out.println("Dilarang masuk");
        } else if (umur > 10){
            tarif = 80000;
        }else{

        System.out.print("Tinggi anda (cm): ");
        tinggi = input.nextDouble();

        if (umur <= 3){
            tarif = 30000;
            if (tinggi>= 70){
                tarif += 10000;
            }
        }else if (umur <=7){
            tarif = 40000;
            if (tinggi >= 120){
                tarif += 15000;
            }
        }else if(umur<=10){
            tarif = 50000;
            if (tinggi >=150) {
                tarif += 20000;
            }
        }
        }
    System.out.println("Tarif tiket anda: "+tarif);
    input.close();
    }
}
