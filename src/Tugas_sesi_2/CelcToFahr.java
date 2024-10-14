package Tugas_sesi_2;
import java.util.Scanner;

public class CelcToFahr {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        float Celcius, Fahrenheit;
        System.out.println("Program Sederhana mengubah Celcius ke Fahrenheit" );
        System.out.print("Masukan suhu (Celcius) : ");
        Celcius = inputan.nextInt();
        Fahrenheit = (Celcius * 9/5) + 32 ;
        System.out.print("Suhu setelah diubah menjadi Fahrenheit : " +Fahrenheit+ " F");
        inputan.close();
    }
}