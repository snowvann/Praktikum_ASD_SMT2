import java.util.Scanner;

public class PlatMobil08 {
    public static void main(String[] args) {
        // Initialize the arrays
        char[] KODE = {
            'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
        };
        char[][] KOTA = {
            {'B','A','N','T','E','N' },
            {'J','A','K','A','R','T','A' },
            {'B','A','N','D','U','N','G' },
            {'C','I','R','E','B','O','N' },
            {'B','O','G','O','R' },
            {'P','E','K','A','L','O','N','G','A','N' },
            {'S','E','M','A','R','A','N','G' },
            {'S','U','R','A','B','A','Y','A' },
            {'M','A','L','A','N','G' },
            {'T','E','G','A','L' },
           
        };

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a code
        System.out.print("Enter a code: ");
        String codeInput = scanner.nextLine();

        // Check if the input code is valid
        boolean isValidCode = false;
        for (int i = 0; i < KODE.length; i++) {
            if (codeInput.charAt(0) == KODE[i]) {
                isValidCode = true;
                break;
            }
        }

        // Print the corresponding city if the code is valid
        if (isValidCode) {
            for (int i = 0; i < KODE.length; i++) {
                if (codeInput.charAt(0) == KODE[i]) {
                    System.out.println("Kota: " + KOTA[i]);
                    break;
                }
            }
        } else {
            System.out.println("Invalid code.");
        }

        // Close the Scanner object
        scanner.close();
    }
}