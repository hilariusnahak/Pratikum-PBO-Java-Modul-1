// Program Java Input Data dari Keyboard
import java.util.Scanner;
public class Prak_105 {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int var_a, var_b;
        System.out.print("Masukkan nilai Variabel var_a : ");
        var_a = masukan.nextInt();
        System.out.print("Masukkan nilai Varibel var_b : ");
        var_b = masukan.nextInt();
        System.out.println();
        System.out.println("Variabel yang terdapat dalam program : ");
        System.out.println("var_a = " + var_a);
        System.out.println("var_b = " + var_b);
    }
}
