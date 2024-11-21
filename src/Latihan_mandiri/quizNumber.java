package Latihan_mandiri;

import java.util.Scanner;

public class quizNumber {
    static int nilai =0;
    static int benar =0;
    static int salah =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
        int a = (int) (Math.random()*11); //0-100
        int b = (int) (Math.random()*4); //0-3
        int c = (int) (Math.random()*11); //0-100
        double d =0;
        switch (b) {
            case 0 :
                System.out.println(a +" + "+ c);
                d = a + c;
                break;
            case 1 :
                System.out.println(a +" - "+ c);
                d = a - c; 
                break;
            case 2 :
                System.out.println(a +" * "+ c);
                d = a * c;
                break;
            case 3 :
            System.out.println(a +" / "+ c);
                d = a / c;
                break;
        }
        System.out.print("Hasilnya adalah: ");
        double hasil = sc.nextDouble();
        if (hasil==d){
            System.out.println("Anda benar");
            nilai =nilai+20;
            benar =benar+1;
        } else {
            System.out.println("Anda Salah");
            salah=salah+1;
        }
    }
    System.out.println("Nilai anda: "+nilai);
    System.out.println("Jawaban benar: "+benar);
    System.out.println("Jawaban salah: "+salah);
        sc.close();
    }
}
