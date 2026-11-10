import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        positifNegatif(in);
    }
    static void positifNegatif(Scanner in) {
        System.out.print("Masukkan angka = ");
        double n = in.nextDouble();
        if (n > 0) {
            System.out.println("Positif");
        } else if (n < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }
}
