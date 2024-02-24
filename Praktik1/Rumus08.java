import java.util.Scanner;

public class Rumus08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double v, s, t;

        do {
            System.out.println("Rumus Kecepatan, Jarak, dan Waktu");
            System.out.println("1. Menghitung hasil perhitungan kecepatan");
            System.out.println("2. Menghitung hasil perhitungan Jarak");
            System.out.println("3. Menghitung hasil perhitungan Waktu");
            System.out.println("43. Exit");
            System.out.print("Masukkan pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jarak (s): ");
                    s = input.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = input.nextDouble();
                    v = s / t;
                    System.out.printf("Kecepatan (%s) adalah: %.2f\n", "m/s", v, "m/s");
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = input.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = input.nextDouble();
                    s = v * t;
                    System.out.printf("Jarak (%s) adalah: %.2f\n", "m", s,"meter");
                    break;
                case 3:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = input.nextDouble();
                    System.out.print("Masukkan jarak (s): ");
                    s = input.nextDouble();
                    t = s / v;
                    System.out.printf("Waktu (%s) adalah: %.2f\n", "s", t + "detik");
                    break;
                case 4:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);

        input.close();
    }
}