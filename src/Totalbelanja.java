import java.util.Scanner;
public class Totalbelanja {
    public static void main(String[] args) throws Exception {
        // jika belanja lebih dari 50k dapat diskon
        System.out.print("Jumlah belanjaan anda: ");
        Scanner inputan = new Scanner(System.in);
        double total = inputan.nextDouble(); 
        double diskon;
        if (total>200000) {
            
            diskon = total*12/100;
            
            if (diskon <= 50000){
                total-=diskon;
                System.out.println("Anda mendapatkan diskon " +diskon);
            } else {
                total-=50000;
                System.out.println("Anda mendapatkan diskon 50000");
            }
        } else if (total>100000){
            diskon = total*10/100;
            if (diskon <= 15000){
                total-=diskon;
                System.out.println("Anda mendapatkan diskon " +diskon);
            } else {
                total-=15000;
                System.out.println("Anda mendapatkan diskon 15000");
            }
        } else if (total>50000){
            diskon = total*5/100;
            if (diskon <= 4000){
                total-=diskon;
                System.out.println("Anda mendapatkan diskon " +diskon);
            } else {
                total-=4000;
                System.out.println("Anda mendapatkan diskon 4000");
            }
        } else {
        System.out.println("Anda tidak mendapatkan diskon");
        }
        System.out.println("Total yang harus anda bayarkan adalah: " + total);
        inputan.close();
       } 
}
