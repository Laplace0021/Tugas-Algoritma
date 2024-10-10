import java.util.Scanner;
public class MenghitungKalori {

    /*
✓ Olahraga lari membakar 60 kalori setiap 5 menit.
✓ Olahraga push-up membakar 200 kalori setiap 30 menit
✓ Olahraga plank membakar 5 kalori selama 1 menit */
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        double kalori= 0.0;
        double total;
        String olahraga;
        int minute;
        System.out.println("Olahraga yang akan anda lakukan: (Lari, Push-up, atau Plank) ");
        olahraga = input.nextLine();
        olahraga=olahraga.toLowerCase();
        System.out.print("Durasi (menit): ");
        minute = input.nextInt();

        if(olahraga.equals("lari")){
            total = 60.0/5;
            kalori = total * minute;
        } else if (olahraga.equals("push-up")){
            total = 200.0/30;
            kalori = total * minute;
        } else if (olahraga.equals("plank")){
            kalori = 5.0 * minute;
        }else{
            System.out.println("Jenis olahraga tidak dikenali");
        }
        
        System.out.println("Anda membakar "+kalori+ " kalori, setelah "+olahraga+ " selama " + minute +" menit.");
        input.close();
    }
}
