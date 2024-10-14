package Latihan_mandiri;
import java.util.Scanner ;


public class Simplecalc {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        String b;
        double a, c;
        System.out.println("==================================" );
        System.out.println("Kalkulator kumulatif");
        System.out.println("==================================" );
        System.out.print("masukan angka : ");
        a = Double.parseDouble(normalizeInput(number.next()));
        c = 0;
        do {  System.out.println("==================================" );
        System.out.println("Silakan pilih : " );
        System.out.println("(+)" );
        System.out.println("(-)" );
        System.out.println("(*)" );
        System.out.println("(/)" );
        System.out.println("(%)" );
        System.out.println("(=)");
        System.out.println("(EXIT)");
        System.out.println("==================================" );
        
        b = number.next();
        
        if(b.equalsIgnoreCase("exit")) {
            System.out.println("Program dihentikan");
            break;
        }

    if (b.equals("+") || b.equals("=") || b.equals("-") || b.equals("*") || b.equals("/") || b.equals("%")) {

        switch (b) {
            case "+":
            System.out.println("==================================" );
                System.out.print("Masukan angka : ");
                c = Double.parseDouble(normalizeInput(number.next()));
                a = a + c;
                System.out.println("==================================" );
                System.out.println("Hasil: " + a);
                break;

            case "-":
            System.out.println("==================================" );
                System.out.print("Masukan angka : ");
                c = Double.parseDouble(normalizeInput(number.next()));
                a = a - c;
                System.out.println("==================================" );
                System.out.println("Hasil: " + a);
                break;

            case "*":
            System.out.println("==================================" );
                System.out.print("Masukan angka : ");
                 c = Double.parseDouble(normalizeInput(number.next()));
                a = a * c;
                System.out.println("==================================" );
                System.out.println("Hasil: " + a);
                break;

            case "/":
            System.out.println("==================================" );
                System.out.print("Masukan angka : ");
                c = Double.parseDouble(normalizeInput(number.next()));
                if (c != 0) {
                    a = a / c;
                    System.out.println("==================================" );
                    System.out.println("Hasil: " + a);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan 0");
                }
                break;

            case "%":
            System.out.println("==================================" );
                System.out.print("Masukan angka : ");
                
                c = Double.parseDouble(normalizeInput(number.next()));
                if (c != 0) {
                    a = a % c;
                    System.out.println("==================================" );
                    System.out.println("Hasil: " + a);
                } else {
                    System.out.println("Error: Tidak bisa modulus dengan 0");
                }
                break;
            case "=":
                a = a + c;
                System.out.println("==================================" );
                System.out.println("Hasil: " +a);
                break;
        }
    } else {
        System.out.println("Silakan masukan operasi yang tersedia");
    
}
            
        } while (true);

        number.close();


    }
    private static String normalizeInput(String input) {
        return input.replace(',', '.');
    }
}
