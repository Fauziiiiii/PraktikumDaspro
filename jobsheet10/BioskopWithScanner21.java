package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom, inputMenu;
        
        do{
            System.out.println("-  Menu 1: Input data penonton");
            System.out.println("-  Menu 2: Tampilkan daftar penonton");
            System.out.println("-  Menu 3: Exit");
            System.out.print("Pilih menu: ");
            inputMenu = sc.nextInt();
            sc.nextLine();

            switch (inputMenu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    System.out.println();

                    if(baris < 1 || baris > 4 || kolom < 1 || kolom > 2){
                        System.out.println("Kursi tidak tersedia!");
                    }
                    
                    if(penonton[baris-1][kolom-1] != null){
                        System.out.println("Kursi telah diisi penonton lainnya!");
                    }else{
                        penonton[baris-1][kolom-1] = nama;
                    }

                    break;

                case 2:
                    System.out.println();
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton pada baris ke-" + (i+1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] == null ? "*** " : penonton[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program berhenti");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }while(inputMenu != 3);

        sc.close();

    }
}
