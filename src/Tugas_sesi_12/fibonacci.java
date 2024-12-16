package Tugas_sesi_12;

public class fibonacci {
    public static int fibonacci(int n, int a,int b){
        
        if (n==1){
            System.out.print(a);
        } else {
            System.out.print(a+",");
            fibonacci(n-1, b, a+b);
        }
         return 0;   
        
    }
    public static void main(String[] args) {
        int n =5;
        int a =1;
        int b =1;
        fibonacci(n, a, b);
    }
}
