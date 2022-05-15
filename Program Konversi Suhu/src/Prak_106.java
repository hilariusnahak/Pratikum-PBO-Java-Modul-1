// Program Java Konversi Suhu
import java.util.Scanner;
public class Prak_106 {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        float celcius, reamur;
        System.out.print("Masukkan nilai suhu (celcius) : ");
        celcius = masukan.nextInt();
        reamur = 0.8F * celcius;
        System.out.println();
        System.out.print("Nilai suhu reamur dari inputan : ");
        System.out.println(reamur);
    }
}
