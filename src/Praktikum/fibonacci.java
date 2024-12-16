package Praktikum;

public class fibonacci {
    public static int fibonacci(int n, int a,int b){
        
        if (n==0){
            return 0;
        } else {
            System.out.print(a+",");
            fibonacci(n-1, b, a+b);
        }
         return 0;   
        
    }
    public static void main(String[] args) {
        int n =20;
        int a = 0;
        int b =1;
        fibonacci(n,a,b);
    }
}
