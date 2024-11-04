package Tugas_sesi_7;

public class looping {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 0 ; j < 4;j++){
                int k = 4-i;
                if (j<k)
                System.out.print("S ");
                else 
                System.out.print("0 ");
                
            }
         System.out.println("");       
        }
    }
}
