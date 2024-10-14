package Tugas_sesi_4;

public class Tugas2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 1) {
                for (int j = 1; j <= 6; j++) {
                    System.out.print(j + " ");
                }
            } else if (i == 2) {
                for (int j = 2; j <= 7; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 3; j <= 8; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
            i++;
        } while (i <= 3);

    }

}
