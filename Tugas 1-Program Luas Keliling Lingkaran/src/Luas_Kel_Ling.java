// Mengambil input dengan class Scanner
/* Scanner merupakan class yang menyediakan
fungsi-fungsi untuk mengambil input dari keyboard. */

import java.util.Scanner;
public class Luas_Kel_Ling {
    public static void main(String[] args) throws Exception {
        // Membuat Scanner baru untuk fungsi input
        Scanner Inputan = new Scanner(System.in);

        // Menginiliasisai Variabel dengan dua tipe data
        // Tipe data R(int) untuk inputan
        // Tipe data K, L(doubel) untuk proses hitung luas dan keliling
        int R;
        double K, L;
        System.out.print("Masukkan Nilai Jari-jari = ");
        R = Inputan.nextInt();
        L = 3.14 * R * R;
        System.out.print("Masukan Nilai Jari-jari = ");
        R = Inputan.nextInt();
        K = 3.14 * 2 * R;
        System.out.println();
        System.out.println("Jadi, Luas keliling jari-jari Tersbut adalah = "+L);
        System.out.println("Jadi, Kelliling lingkaran Tersebut adalah = "+K);
        System.out.println();
    }
}
