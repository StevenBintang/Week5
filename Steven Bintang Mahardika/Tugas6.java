import java.util.Scanner;

public class Tugas6 {
    public static void Main(String[] args) {    
    }
    static void genapGanjil(Scanner in) {
        System.out.print("Masukkan angka = ");
        int angka = in.nextInt();
        System.out.println(angka % 2 == 0 ? "Genap" : "Ganjil");
    }

    static void positifNegatif(Scanner in) {
        System.out.print("Masukkan angka = ");
        double angka = in.nextDouble();
        if (angka > 0) {
            System.out.println("Positif");
        } else if (angka < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }

    static void nilaiGrade(Scanner in) {
        System.out.print("Masukkan nilai = ");
        double nilai = in.nextDouble();
        if (nilai >= 85) {
            System.out.println("Grade A");
        } else if (nilai >= 75) {
            System.out.println("Grade B");
        } else if (nilai >= 65) {
            System.out.println("Grade C");
        } else if (nilai >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
        System.out.println(nilai >= 60 ? "Lulus" : "Tidak lulus");
    }

    static void namaHari(Scanner in) {
        System.out.print("Masukkan angka hari (1-7) = ");
        int hari = in.nextInt();
        switch (hari) {
            case 1: System.out.println("Senin"); break;
            case 2: System.out.println("Selasa"); break;
            case 3: System.out.println("Rabu"); break;
            case 4: System.out.println("Kamis"); break;
            case 5: System.out.println("Jumat"); break;
            case 6: System.out.println("Sabtu"); break;
            case 7: System.out.println("Minggu"); break;
            default: System.out.println("Angka hari tidak valid");
        }
    }

    static void kalkulator(Scanner in) {
        System.out.print("Masukkan angka pertama = ");
        double a = in.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /) = ");
        String operator = in.next();
        System.out.print("Masukkan angka kedua = ");
        double b = in.nextDouble();

        switch (operator) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/":
                if (b == 0) {
                    System.out.println("Tidak dapat membagi dengan nol");
                } else {
                    System.out.println(a / b);
                }
                break;
            default: System.out.println("Operator tidak valid");
        }
    }

static void jenisSegitiga(Scanner in) {
        System.out.print("Masukkan sisi 1 = ");
        double a = in.nextDouble();
        System.out.print("Masukkan sisi 2 = ");
        double b = in.nextDouble();
        System.out.print("Masukkan sisi 3 = ");
        double c = in.nextDouble();
 
        boolean valid = a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b && b + c > a;
 
        if (!valid) {
            System.out.println("Bukan segitiga");
        } else if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");
        } else if (a == b || b == c || a == c) {
            System.out.println("Segitiga sama kaki");
        } else {
            System.out.println("Segitiga sembarang");
        }
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.println("=== LATIHAN ===");
        System.out.println("1. Genap / Ganjil");
        System.out.println("2. Positif / Negatif / Nol");
        System.out.println("3. Nilai -> Grade & Status");
        System.out.println("4. Angka -> Nama Hari");
        System.out.println("5. Kalkulator");
        System.out.println("6. Jenis Segitiga");
        System.out.print("Pilih soal (1-6) = ");
        int pilihan = in.nextInt();
 
        switch (pilihan) {
            case 1:
                genapGanjil(in);
                break;
            case 2:
                positifNegatif(in);
                break;
            case 3:
                nilaiGrade(in);
                break;
            case 4:
                namaHari(in);
                break;
            case 5:
                kalkulator(in);
                break;
            case 6:
                jenisSegitiga(in);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
 
        in.close();
    }
}
 