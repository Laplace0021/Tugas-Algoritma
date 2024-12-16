package Praktikum;

public class printReverse {
    public static void Reverse(int n) {
        if (n>1){
            System.out.print(n+",");
            Reverse(n-1);
        } else{
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Reverse(10);
    }
}
