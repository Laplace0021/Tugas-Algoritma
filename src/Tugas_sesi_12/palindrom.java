package Tugas_sesi_12;
import java.util.Scanner;
public class palindrom {
    public static boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            System.out.println( str +" adalah palindrome");
            return true;
        }
        if (str.charAt(start)!=str.charAt(end)){
            System.out.println(str+" bukan palindrome");
            return false;
        }
        if (str.charAt(start)==str.charAt(end)){
            return isPalindrome(str, start+1, end-1);
        }
        return false;
    }
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata: ");
        String str = sc.next();
        isPalindrome(str, 0, str.length()-1);
    }
}
