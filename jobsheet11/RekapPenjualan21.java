package jobsheet11;

import java.util.Scanner;

public class RekapPenjualan21 {
    static Scanner sc = new Scanner(System.in);

    public static void inputData(int[][] penjualan, String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanData(int[][] penjualan, String[] menu) {
        System.out.println("\n=== REKAP DATA PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("H-" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); 

            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] penjualan, String[] menu) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                totalPerMenu += penjualan[i][j];
            }
            
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris);
        System.out.println("Total terjual: " + maxPenjualan);
    }

    public static void rataRata(int[][] penjualan, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                totalPerMenu += penjualan[i][j];
            }
            double rata = (double) totalPerMenu / penjualan[0].length;
            System.out.printf("%s: %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] dataPenjualan = new int[menu.length][7]; // 7 merupakan total hari

        inputData(dataPenjualan, menu);
        tampilkanData(dataPenjualan, menu);
        menuTertinggi(dataPenjualan, menu);
        rataRata(dataPenjualan, menu);
    }
}