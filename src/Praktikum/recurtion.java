package Praktikum;

public class recurtion {
    public static int faktorial(int n){
        System.out.print(n);
        if(n>1){
            System.out.print(" x ");
        }
        if(n>1){
            return n * faktorial(n-1) ;
        } else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int result = faktorial(5);
        System.out.println(" = "+result);
    }
}
