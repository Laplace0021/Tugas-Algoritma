import java.util.Scanner ;
public class LuasPersegiPanjang {
    public static void main(String[] args)throws Exception {
        Scanner inputan = new Scanner(System.in);
        float Panjang, Lebar, Luas;
        System.out.print("Masukan Panjang persegi panjang : ");
        Panjang = inputan.nextFloat();
        System.out.print("Masukan Lebar persegi panjang : ");
        Lebar = inputan.nextFloat();
        Luas = Panjang*Lebar;
        System.out.println("Luas persegi panjangnya adalah "+Luas);
        inputan.close();    
    }
}
