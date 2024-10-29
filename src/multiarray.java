
public class multiarray {

    public static void main(String[] args) {
        String[][][] Mahasiswa = {
                {
                        { "Putra", "Naban", "Reggie", "Dwi", "Zaim" },
                        { "Robby", "Revan", "Null", "Null", "Null" }
                },
                {
                        { "Januar", "Naufal", "Gidzane", "Hamudi", "Ibnu" },
                        { "Deni", "Ilham", "Ade", "Fahrul", "Ananda" }
                },
                {
                        { "Null", "Null", "Luqman", "Nazriel", "Rizki" },
                        { "Alexander", "Asril", "Iqbal", "Hafidz", "Jaffar" }
                },
                {
                        { "Salwa", "Djibriel", "Esa", "Isti", "Restu" },
                        { "Rosya", "Naura", "Zaskia", "Null", "Null" }
                }
        };
        System.out.println(Mahasiswa[3][0][1]);

    }
}
