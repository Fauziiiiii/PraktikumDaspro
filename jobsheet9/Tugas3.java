package jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        String searchMenu;
        boolean statusSearch = false;

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        searchMenu = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchMenu)) {
                statusSearch = true;
                break; 
            }
        }

        System.out.println("\n--- Hasil Pencarian ---");

        if (statusSearch) {
            System.out.println("Status: TERSEDIA");
            System.out.println("Pesanan '" + searchMenu + "' ada di menu.");
        } else {
            System.out.println("Status: TIDAK TERSEDIA");
            System.out.println("Maaf, pesanan '" + searchMenu + "' tidak ada di menu.");
        }

        sc.close();
    }
}
