package Essay_Uts;
import java.util.Scanner;

public class gajiTotal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan gaji bulanan anda: ");
        int gajiBulanan = sc.nextInt();
        System.out.print("Masukan total jam lembur: ");
        int jLembur = sc.nextInt();
        int lembur_lebih=0;
        if (jLembur>5){
            lembur_lebih = jLembur - 5;
            jLembur = 5;
        }
        int Ulembur = gajiBulanan/150; //50.000
        
        int totalGaji = gajiBulanan + (jLembur*Ulembur) + (lembur_lebih*3*Ulembur/2); //7.500.000 + (5*50.000) + (1*50.000*3/2)
        System.out.println("Total Gaji: "+totalGaji); //7.500.000 + 250.000 + 75.000
        sc.close();
    }
}
