package Tugas_sesi_4;
// * * * * * 5
// * * * * 4 5 
// * * * 3 4 5
// * * 2 3 4 5
// * 1 2 3 4 5
// 0 1 2 3 4 5
public class Tugas5 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0; j<=5;j++){
                int k=5-i;
                if(j<k)
                System.out.print("* ");
                else
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
