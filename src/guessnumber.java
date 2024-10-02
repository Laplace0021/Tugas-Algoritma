import java.util.Random;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) throws Exception {
        Random Rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("==================================================" );
        System.out.println("Game menebak angka");
        System.out.println("==================================================" );
        int randnumber = Rand.nextInt(100) + 1;
        int tebakan;
        
        while (true) {
            System.out.print("Masukan tebakan anda: ");
            tebakan = input.nextInt();

            if (tebakan > randnumber ) {
                System.out.println("==================================================" );
                System.out.print("Tebakan anda terlalu tinggi, ");
            } else if (tebakan < randnumber) {
                System.out.println("==================================================" );
                System.out.print("Tebakan anda terlalu rendah, ");
            } else {
                System.out.println("==================================================" );
                System.out.println("Tebakan anda tepat");
                System.out.println("==================================================" );
                break;   
            }
        }
        input.close();
    }    
}
