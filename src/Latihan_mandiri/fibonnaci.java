package Latihan_mandiri;
public class fibonnaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(" "+a);
        System.out.print(" "+b);
        while (b<50000000){
            int c= a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
