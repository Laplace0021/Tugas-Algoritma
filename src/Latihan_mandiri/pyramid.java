package Latihan_mandiri;

/*
 *  0 0 0 0 A 0 0 0 0
 *  0 0 0 A A A 0 0 0
 *  0 0 A A A A A 0 0
 *  0 A A A A A A A 0
 *  A A A A A A A A A 
 */
public class pyramid {
    public static void main(String[] args) {
        int a =0;
        int b = 9/2;
        for (int p = 0; p<b+1; p++){
            for ( int q = 0; q<9;q++ ){
                if (q<= b+a && q>=b-a)
                System.out.print("A ");
                else 
                System.out.print("  ");
                
            }
            a++;
            System.out.println("");
        }
    }
}
