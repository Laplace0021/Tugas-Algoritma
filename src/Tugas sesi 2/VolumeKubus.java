import java.util.Scanner;
public class VolumeKubus {
    public static void main(String[] args)throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan sisi kubus : ");
        float sisi = inputan.nextFloat();
        float Volume = sisi*sisi*sisi;
        System.out.println("Volume kubusnya adalah : "+Volume);
        inputan.close();    }
 }
    

