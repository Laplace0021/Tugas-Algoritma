import java.util.Scanner ;
import java.util.InputMismatchException;

public class simplecalc {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        String b;
        double a, c, d;
        System.out.println("Program ini hanya dapat menjalankan operasi simple saja dan berlaku untuk 2 buah variabel");
        System.out.print("masukan angka pertama (gunakan . sebagai pengganti , jika angka yang dimasukan adalah desimal) : ");
        a = number.nextDouble();
        System.out.print("masukan operasi yang anda ingin jalankan (+,-,*,/,%) : " );
        b = number.next();
        System.out.print("Masukan angka kedua (gunakan . sebagai pengganti , jika angka yang dimasukan adalah desimal) : ");
        c = number.nextDouble();
        

 // Check if inputs are NaN (Not a Number)
 if (Double.isNaN(a) || Double.isNaN(c)) {
    System.out.println("Masukan angka saja");
} else {
    // Check if the operation is valid
    if (b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/") || b.equals("%")) {

        switch (b) {
            case "+":
                d = a + c;
                System.out.println("Hasil: " + d);
                break;

            case "-":
                d = a - c;
                System.out.println("Hasil: " + d);
                break;

            case "*":
                d = a * c;
                System.out.println("Hasil: " + d);
                break;

            case "/":
                if (c != 0) {
                    d = a / c;
                    System.out.println("Hasil: " + d);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan 0");
                }
                break;

            case "%":
                if (c != 0) {
                    d = a % c;
                    System.out.println("Hasil: " + d);
                } else {
                    System.out.println("Error: Tidak bisa modulus dengan 0");
                }
                break;
        }
    } else {
        System.out.println("Silakan masukan operasi yang tersedia");
    }
}


number.close();
}
}
