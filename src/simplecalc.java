import java.util.Scanner ;


public class simplecalc {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        String b;
        double a, c, d;
        System.out.println("Kalkulator kumulatif");
        System.out.println("" );
        System.out.print("masukan angka : ");
        a = number.nextDouble();
        c = 1;
        do {  System.out.println("" );
        System.out.println("Silakan pilih : " );
        System.out.println("(+)" );
        System.out.println("(-)" );
        System.out.println("(*)" );
        System.out.println("(/)" );
        System.out.println("(%)" );
        if (c!=0){
            System.out.println("(=)");
        }
        b = number.next();
        
        

 // Check if inputs are NaN (Not a Number)
 if (c==0) {
    System.out.println("Masukan angka saja");
} else {
    // Check if the operation is valid
    if (b.equals("+") || b.equals("=") || b.equals("-") || b.equals("*") || b.equals("/") || b.equals("%")) {

        switch (b) {
            case "+":
                System.out.print("Masukan angka : ");
                c = number.nextDouble();
                a = a + c;
                System.out.println("Hasil: " + a);
                break;

            case "-":
                System.out.print("Masukan angka : ");
                c = number.nextDouble();
                a = a - c;
                System.out.println("Hasil: " + a);
                break;

            case "*":
                System.out.print("Masukan angka : ");
                 c = number.nextDouble();
                a = a * c;
                System.out.println("Hasil: " + a);
                break;

            case "/":
                System.out.print("Masukan angka : ");
                c = number.nextDouble();
                if (c != 0) {
                    a = a / c;
                    System.out.println("Hasil: " + a);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan 0");
                }
                break;

            case "%":
                System.out.print("Masukan angka : ");
                c = number.nextDouble();
                if (c != 0) {
                    a = a % c;
                    System.out.println("Hasil: " + a);
                } else {
                    System.out.println("Error: Tidak bisa modulus dengan 0");
                }
                break;
            case "=":
                a = a + c;
                System.out.println("Hasil: " +a);
                break;
        }
    } else {
        System.out.println("Silakan masukan operasi yang tersedia");
    }
}
            
        } while (true);
       
}
}
