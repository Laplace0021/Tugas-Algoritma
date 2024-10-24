package Latihan_mandiri;

public class square {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("X ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println(" ");
        }
        
    }
}
