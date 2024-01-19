import java.util.Scanner;

public class SpeechProcessingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Speech Processing System!");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert spoken language to written text");
        System.out.println("2. Convert written text to spoken language");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                System.out.println("Please speak your sentence:");
                String spokenLanguage = scanner.nextLine();
                // Code for converting spoken language to written text
                break;
            case 2:
                System.out.println("Please enter your text:");
                String writtenText = scanner.nextLine();
                // Code for converting written text to spoken language
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }

        scanner.close();
    }
}

