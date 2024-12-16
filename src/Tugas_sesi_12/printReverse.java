package Tugas_sesi_12;

public class printReverse {
    public static void reverse(int n){
        if(n>1){
            System.out.print(n+",");
            reverse(n-1);
        } else if(n==1){
            System.out.print(n);
        }
        return;
    }
    public static void main(String[] args) {
        reverse(5);
    }
}
