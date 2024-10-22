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
        buah1.add("apel");
        buah1.add("35000");
        Buah.add(buah1);

        ArrayList<String> buah2 = new ArrayList<>();
        buah2.add("jeruk");
        buah2.add("50000");
        Buah.add(buah2);

        ArrayList<String> buah3 = new ArrayList<>();
        buah3.add("mangga");
        buah3.add("25000");
        Buah.add(buah3);

        ArrayList<String> buah4 = new ArrayList<>();
        buah4.add("duku");
        buah4.add("15000");
        Buah.add(buah4);

        ArrayList<String> buah5 = new ArrayList<>();
        buah5.add("semangka");
        buah5.add("20000");
        Buah.add(buah5);

        int pilihan = 1;
        String inputlagi = "y";
        String tambahBuah = "y";

        do { // looping
             // menampilkan menu
            System.out.println("=".repeat(50));
            System.out.println("Menu: ");
            System.out.println("=".repeat(50));
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.println("=".repeat(50));
            System.out.print("Masukan Pilihan: "); // meminta pilihan
            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 3) {
                System.out.println("Anda telah keluar dari program");
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
                        System.out.println((i + 1) + ". " + nama + " - " + harga ); // +1 agar menu yang ditampilkan dimulai dari 1.
                    }
                    System.out.print("Buah yang ingin anda beli: ");
                    int buahdipilih = sc.nextInt();
                    sc.nextLine();
                    buahdipilih -= 1; // -1 karena menyesuaikan dengan index

                    if (buahdipilih >= 0 && buahdipilih < Buah.size()) { // jika angka yang dimasukan user ada di array
                        System.out.print("Masukan jumlah: ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        String nama = Buah.get(buahdipilih).get(0); // mendeklarasikan variabel baru dengan data dari ArrayList Buah
                        int harga = Integer.parseInt(Buah.get(buahdipilih).get(1));
                        int subtotal = jumlah * harga;

                        namaBuah.add(nama); // memasukan data ke arraylist namaBuah
                        jumlahBuah.add(jumlah); // memasukan data ke arraylist jumlahBuah
                        hargaBuah.add(harga); // memasukan data ke arraylist hargaBuah
                        totalbelanja += subtotal;

                        System.out.println("Buah telah ditambahkan kedalam keranjang");

                        System.out.print("Ingin menambah buah lain kedalam keranjang? (y/n): ");
                        tambahBuah = sc.nextLine().toLowerCase();
                    } else {
                        System.out.println("Masukan berupa angka yang tersedia"); // jika user menginput data yang tidak
                        // tersedia di list
                    }
                }while(tambahBuah.equals("y"));
                    break; // mengembalikan user ke menu utama
                case 2: // jika user mengambil struk
                    System.out.println("\t\tDaftar Belanja:");
                    System.out.println("=".repeat(50));
                    if (namaBuah.isEmpty()) { // jika user belum membeli buah
                        System.out.println("=== Anda belum menambahkan apapun ===");
                        break; // dikembalikan ke menu utama
                    }
                    System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");

                    for (int i = 0; i < namaBuah.size(); i++) { // mengambil setiap data di ArrayList
                        String nama = namaBuah.get(i);
                        int jumlah = jumlahBuah.get(i);
                        int harga = hargaBuah.get(i);
                        int subtotal = jumlah * harga;

                        System.out.println((i + 1) + "\t" + nama + "\t\t" + jumlah + "\t" + harga + "\t" + subtotal);

                    }

                    System.out.println("=".repeat(50));
                    System.out.println("Total: " + totalbelanja);
                    int diskon = totalbelanja * 15 / 100;
                    System.out.println("Discount(15%): " + diskon);
                    int totalbayar = totalbelanja - diskon;
                    System.out.println("Total bayar: " + totalbayar);
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
                            System.out.println("Kembalian anda: " + kembalian);
                            System.out.print("Ingin membeli barang yang lainnya? (y/n): "); // if y then loop if n then end the loop
                            inputlagi = sc.nextLine().toLowerCase();
                            namaBuah.clear(); // menghapus semua data yang ada di dalam array
                            jumlahBuah.clear();
                            hargaBuah.clear();
                            totalbelanja = 0;
                        }
                    } else if (input != 2) { // jika user menginput selain 1 dan 2
                        System.out.println("Masukan input yang tersedia, anda dikembalikan ke menu utama.");
                    }

                    break; // user memilih kembali, dikembalikan ke menu utama

                default: // jika user memasukan input selain 1,2,dan 3
                    System.out.println("Masukan pilihan yang tersedia");
                    break; // kembali ke menu utama
            }

        } while (inputlagi.equals("y"));
        sc.close();
    }
}
