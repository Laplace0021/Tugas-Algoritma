import java.util.Random;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) throws Exception {
        Random Rand = new Random();
        Scanner input = new Scanner(System.in);

        int randnumber = Rand.nextInt(1000) + 1;
        int tebakan;
        
        while (true) {
            System.out.println("Masukan tebakan anda");
            tebakan = input.nextInt();

            if (tebakan > randnumber ) {
                System.out.println("Tebakan anda terlalu tinggi");
            } else if (tebakan < randnumber) {
                System.out.println("Tebakan anda terlalu rendah");
            } else {
                System.out.println("Tebakan anda tepat");
                break;   
            }
        }
        input.close();
    }    
}
