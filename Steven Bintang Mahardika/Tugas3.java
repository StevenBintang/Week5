import java.util.Scanner;

public class Tugas3 {
    static void nilaiGrade(Scanner in) {
        System.out.print("Masukkan nilai = ");
        int nilai = in.nextInt();
        char grade;
        if (nilai >= 85) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 55) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        String status = nilai >= 55 ? "Lulus" : "Tidak Lulus";
        System.out.println("Grade: " + grade + ", Status: " + status);
    }
}
