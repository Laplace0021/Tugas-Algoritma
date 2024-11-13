package Praktikum;
import java.util.Scanner;

public class Latihanifelese {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        Double Totalkg, subtotal, discount, bayar, uang, kembalian; 
        discount = 0.0;

        System.out.print("Berapa KG telur yang ingin anda beli? ");
        Totalkg = inputan.nextDouble();
        subtotal = Totalkg * 28000;
        System.out.print("Masukan uang anda ");
        uang = inputan.nextDouble();
        if (Totalkg > 3) {
        discount = 0.1*subtotal;
        } 

        bayar = subtotal - discount;
        kembalian = uang - bayar;
        System.out.println("Total yang dibeli "+Totalkg+" KG");
        System.out.println("Subtotal " +subtotal);
        System.out.println("Discount " +discount);
        System.out.println("Uang yang dibayarkan " +bayar);
        System.out.println("Uang kembalian " +kembalian);
        
        inputan.close();
    }
}
