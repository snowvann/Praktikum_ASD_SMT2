import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
        double gradePancasila = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        double gradeKTI = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        double gradeCTPS = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Matermatika Dasar: ");
        double gradeMD = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris: ");
        double gradeBI = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        double gradeDP = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        double gradePDP = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        double gradeKKK = scanner.nextDouble();

        double[] grades = {gradePancasila, gradeKTI, gradeCTPS, gradeMD, gradeBI, gradeDP, gradePDP, gradeKKK};
        double[] credits = {3.5, 4, 3, 4, 4, 2.5, 2.5, 4};

        double sumGrades = 0;
        double sumCredits = 0;

        for (int i = 0; i < grades.length; i++) {
            sumGrades += grades[i] * credits[i];
            sumCredits += credits[i];
        }

        double ip = sumGrades / sumCredits;

        System.out.printf("Hasil Konversi Nilai%n");
        System.out.printf("MK%nPancasila%nKonsep Teknologi Informasi%nCritical Thinking dan Problem Solving%nMatermatika Dasar%nBahasa Inggris%nDasar Pemrograman%nPraktikum Dasar Pemrograman%nKeselamatan dan Kesehatan Kerja%nIP: %.2f%n", ip);
        System.out.printf("Nilai Angka%n%.2f%n%.2f%n%.2f%n%.2f%n%.2f%n%.2f%n%.2f%n%.2f%n", gradePancasila, gradeKTI, gradeCTPS, gradeMD, gradeBI, gradeDP, gradePDP, gradeKKK);
        System.out.printf("Nilai Huruf%nB+%nA%nB%nA%nA%nC+%nC+%nB%n");
        System.out.printf("Bobot Nilai%n3.50%n4.00%n3.00%n4.00%n4.00%n2.50%n2.50%n4.00%n");
    }
}