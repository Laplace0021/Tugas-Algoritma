package Latihan_mandiri;
import java.util.Scanner;


public class SimpleCalcV2 {

    static Scanner input = new Scanner(System.in);
    static Double a , b;
    static String operasi;

    private static String normalizeIput(String input) {
        return input.replace(",",".");
    }

    public static void plus(){
        System.out.print("Masukan angka : ");
        b = Double.parseDouble(normalizeIput(input.next()));
        a = a + b;
        System.out.println("\t\t\t"+a);
    }
    public static void minus(){
        System.out.print("Masukan angka : ");
        b = Double.parseDouble(normalizeIput(input.next()));
        a = a - b;
        System.out.println("\t\t\t"+a);
    }
    public static void times(){
        System.out.print("Masukan angka : ");
        b = Double.parseDouble(normalizeIput(input.next()));
        a = a * b;
        System.out.println("\t\t\t"+a);
    }
    public static void diff(){
        System.out.print("Masukan angka : ");
        b = Double.parseDouble(normalizeIput(input.next()));
        if (b != 0){
            a = a / b;
            System.out.println("\t\t\t"+a);
            }else{System.out.println("\t\t\tError");}
    }
    public static void mod(){
        System.out.print("Masukan angka : ");
        b = Double.parseDouble(normalizeIput(input.next()));
        if (b != 0){
        a = a % b;
        System.out.println("\t\t\t"+a);
        }else{System.out.println("\t\t\tError");}
    }
    public static void equals(){
        a = a + b;
        System.out.println("\t\t\t"+a);
    }
    public static void exit(){
        System.out.print("Program dihentikan");
        
    }
    
    

    public static void main(String[] args) {
        SimpleCalcV2 Operan = new SimpleCalcV2();
        System.out.println("=".repeat(50));
        System.out.println("Kalkulator");
        System.out.println("=".repeat(50));
        
        System.out.print("Masukan angka : ");
        a = Double.parseDouble(normalizeIput(input.next()));
        b = 0.0;

        do { 
            System.out.println("=".repeat(50)+"\nOperasi");
            System.out.println("(+)" );
            System.out.println("(-)" );
            System.out.println("(*)" );
            System.out.println("(/)" );
            System.out.println("(%)" );
            System.out.println("(=)");
            System.out.println("(EXIT)\n"+"=".repeat(50));
            System.out.print("Pilih Operasi : ");
            operasi = input.next();

            if (operasi.equalsIgnoreCase("exit")){
                SimpleCalcV2.exit();
                break;
            }
            switch (operasi) {
                case "+":
                    SimpleCalcV2.plus();
                    break;
                case "-":
                    SimpleCalcV2.minus();
                    break;
                case "*":
                    SimpleCalcV2.times();
                    break;
                case "/":
                    SimpleCalcV2.diff();
                    break;
                case "%":
                    SimpleCalcV2.mod();
                    break;
                case "=":
                    SimpleCalcV2.equals();
                    break;
                default:
                    System.out.println("Pilih operasi yang tersedia");
                    break;
            }

        } while (true);

        
    }
}
