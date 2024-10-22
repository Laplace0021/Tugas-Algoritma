package Tugas_sesi_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2 {
    // Arraylist dir
    static ArrayList<ArrayList<String>> Buah = new ArrayList<>();
    static ArrayList<String> namaBuah = new ArrayList<>();
    static ArrayList<Integer> jumlahBuah = new ArrayList<>();
    static ArrayList<Integer> hargaBuah = new ArrayList<>();
    static int totalbelanja = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menambahkan data ke ArrayList<String>
        ArrayList<String> buah1 = new ArrayList<>();
        buah1.add("Apel");
        buah1.add("35000");
        Buah.add(buah1);

        ArrayList<String> buah2 = new ArrayList<>();
        buah2.add("Jeruk");
        buah2.add("50000");
        Buah.add(buah2);

        ArrayList<String> buah3 = new ArrayList<>();
        buah3.add("Mangga");
        buah3.add("25000");
        Buah.add(buah3);

        ArrayList<String> buah4 = new ArrayList<>();
        buah4.add("Duku");
        buah4.add("15000");
        Buah.add(buah4);

        ArrayList<String> buah5 = new ArrayList<>();
        buah5.add("Semangka");
        buah5.add("20000");
        Buah.add(buah5);

        int pilihan = 1;
        String inputlagi = "y";
        String tambahBuah = "y";

        do { // looping
             // menampilkan menu
            System.out.println("=".repeat(50));
            System.out.println("Selamat datang di toko buah!");
            System.out.println("=".repeat(50));
            System.out.println("Silakan pilih salah satu opsi berikut:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.println("=".repeat(50));
            System.out.print("Masukan Pilihan: "); // meminta pilihan
            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 3) {
                break; // menghentikan program
            }
            switch (pilihan) {
                case 1: // jika user membeli buah
                do{
                    System.out.println("=".repeat(50));
                    System.out.println("Buah yang tersedia: "); // menampilkan menu buah yang tersedia
                    for (int i = 0; i <= 4; i++) { // diambil dari Arraylist<ArrayList<String>> Buah
                        String nama = Buah.get(i).get(0);
                        String harga = Buah.get(i).get(1);
                        System.out.println((i + 1) + ". " + nama + " \t Rp." + harga ); // +1 agar menu yang ditampilkan dimulai dari 1.
                    }
                    System.out.print("Masukan nomor buah yang ingin anda beli: ");
                    int buahdipilih = sc.nextInt();
                    sc.nextLine();
                    buahdipilih -= 1; // -1 karena menyesuaikan dengan index

                    if (buahdipilih >= 0 && buahdipilih < Buah.size()) { // jika angka yang dimasukan user ada di array
                        System.out.print("Masukan jumlah (kg): ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        String nama = Buah.get(buahdipilih).get(0); // mendeklarasikan variabel baru dengan data dari ArrayList Buah
                        int harga = Integer.parseInt(Buah.get(buahdipilih).get(1));
                        int subtotal = jumlah * harga;

                        namaBuah.add(nama); // memasukan data ke arraylist namaBuah
                        jumlahBuah.add(jumlah); // memasukan data ke arraylist jumlahBuah
                        hargaBuah.add(harga); // memasukan data ke arraylist hargaBuah
                        totalbelanja += subtotal;

                        System.out.println("Buah "+nama+ " sebanyak " + jumlah + "KG telah ditambahkan kedalam keranjang.");

                        System.out.print("Ingin menambah buah lain kedalam keranjang? (y/n): ");
                        tambahBuah = sc.nextLine().toLowerCase();
                    } else {
                        System.out.println("Masukan nomor buah yang tersedia."); // jika user menginput data yang tidak
                        // tersedia di list
                    }
                }while(tambahBuah.equals("y"));
                    break; // mengembalikan user ke menu utama
                case 2: // jika user mengambil struk
                    System.out.println("\t\tDaftar Belanja");
                    System.out.println("=".repeat(50));
                    if (namaBuah.isEmpty()) { // jika user belum membeli buah
                        System.out.println("=== Anda belum menambahkan apapun kedalam keranjang ===");
                        break; // dikembalikan ke menu utama
                    }
                    System.out.printf( "%-3s %-10s %-11s %-9s %-10s %n","No.","Nama Buah","Jumlah","Harga","Subtotal");

                    for (int i = 0; i < namaBuah.size(); i++) { // mengambil setiap data di ArrayList
                        String nama = namaBuah.get(i);
                        int jumlah = jumlahBuah.get(i);
                        int harga = hargaBuah.get(i);
                        int subtotal = jumlah * harga;

                        System.out.printf("%-3d %-12s %-9d %-10s %-10s %n",(i + 1),nama,jumlah,harga,subtotal);

                    }

                    System.out.println("=".repeat(50));
                    System.out.println("Total: Rp." + totalbelanja);
                    int diskon = totalbelanja * 15 / 100;
                    System.out.println("Discount(15%): Rp." + diskon);
                    int totalbayar = totalbelanja - diskon;
                    System.out.println("Total bayar: Rp." + totalbayar);
                    System.out.println("=".repeat(50));
                    System.out.println("1. Bayar");
                    System.out.println("2. Kembali");
                    int input = sc.nextInt();
                    if (input == 1) { // menu bayar
                        System.out.print("Masukan jumlah uang: ");
                        int uang = sc.nextInt();
                        sc.nextLine();
                        if (uang < totalbayar) {
                            System.out.println("=== Uang anda tidak cukup ===");
                            break; // dikembalikan ke menu utama
                        } else {
                            System.out.println("=== Pembayaran berhasil ===");
                            int kembalian = uang - totalbayar;
                            System.out.println("Kembalian anda: Rp." + kembalian);
                            System.out.print("Ingin membeli buah yang lainnya? (y/n): "); // if y then loop if n then end the loop
                            inputlagi = sc.nextLine().toLowerCase();
                            namaBuah.clear(); // menghapus semua data yang ada di dalam array
                            jumlahBuah.clear();
                            hargaBuah.clear();
                            totalbelanja = 0;
                        }
                    } else if (input != 2) { // jika user menginput selain 1 dan 2
                        System.out.println("Opsi tidak tersedia.");
                    }

                    break; // user memilih kembali, dikembalikan ke menu utama

                default: // jika user memasukan input selain 1,2,dan 3
                    System.out.println("Masukan pilihan yang tersedia.");
                    break; // kembali ke menu utama
            }

        } while (inputlagi.equals("y"));
        System.out.println("=== Terima kasih sudah berbelanja ===");
        sc.close();
    }
}
