package Latihan_mandiri;

import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

    static ArrayList<String> todo = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("=".repeat(50));
            System.out.println("\t\tTo Do List Program");
            System.out.println("1. Tambah Task");
            System.out.println("2. Lihat Task List");
            System.out.println("3. Hapus Task");
            System.out.println("4. Hentikan Program");
            System.out.print("Input di sini: ");
            int input = sc.nextInt();
            sc.nextLine();
            System.out.println("=".repeat(50));

            switch (input) {
                case 1:
                    addList();
                    break;
                case 2:
                    taskList();
                    break;
                case 3:
                    deleteList();
                    break;
                case 4:
                    System.out.println("Program Dihentikan");
                    sc.close();
                    return;
                default:
                    break;
            }

        } while (true);
    }

    static void addList() {
        System.out.println("\t\tTambah Task");
        System.out.print("Task Baru: ");
        String list = sc.nextLine();
        System.out.println("Task "+list+" telah ditambahkan");
        todo.add(list);

    }

    static void taskList() {
        System.out.println("\t\tDaftar Task");
        for (int i = 0; i < todo.size(); i++) {
            String List = todo.get(i);
            System.out.println((i + 1) + ". " + List);
        }
        System.out.println("Enter untuk melanjutkan");
        sc.nextLine();

    }

    static void deleteList() {
        int no;
        boolean lagi = true;
        do {
            System.out.println("\t\tHapus List");
            System.out.println("0. kembali ke menu utama");
            for (int i = 0; i < todo.size(); i++) {
                String List = todo.get(i);
                System.out.println((i + 1) + ". " + List);
            }
            System.out.print("Hapus List No: ");
            no = sc.nextInt();
            if (no == 0) {

                lagi = false;
                break;
            } else if (no > 0 && no <= todo.size()) {
                sc.nextLine();
                int index = no - 1;
                System.out.println(todo.get(no - 1) + " Telah dihapus dari daftar");
                System.out.println("=".repeat(50));
                todo.remove(index);
            } else {
                System.out.println("no yang anda input tidak merujuk pada list apapun");
                System.out.println("");
            }
        } while (lagi);
    }
}
