import java.util.Scanner;

public class Tugas5 {
     static void kalkulator(Scanner in) {
        System.out.print("Masukkan Angka Pertama = ");
        double a = in.nextDouble();
 
        System.out.print("Masukkan Operatornya (+ - * / %) = ");
        char op = in.next().charAt(0);
 
        System.out.print("Masukkan Angka Kedua = ");
        double b = in.nextDouble();
 
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Tidak bisa dibagi nol");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Tidak bisa modulo dengan nol");
                } else {
                    System.out.println(a + " % " + b + " = " + (a % b));
                }
                break;
            default:
                System.out.println("Operator tidak dikenal");
        }
    }
}
