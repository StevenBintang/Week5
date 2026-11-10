import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        genapGanjil(in);
    }
   static void genapGanjil(Scanner in) {
        System.out.print("Masukkan angka = ");
        int n = in.nextInt();
        System.out.println(n % 2 == 0 ? n + " adalah Genap" : n + " adalah Ganjil");
    }}