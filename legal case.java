import java.util.Scanner;

public class LegalCaseAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        LEGAL CASE ANALYZER       ");
        System.out.println("=================================");
        System.out.println("Select a legal case to analyze:\n");

        System.out.println("1. Tinker v. Des Moines (1969)");
        System.out.println("2. Brown v. Board of Education (1954)");
        System.out.println("3. Miranda v. Arizona (1966)");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.println("\n---------------------------------\n");

        switch (choice) {
            case 1:
                showTinkerCase();
                break;
            case 2:
                showBrownCase();
                break;
            case 3:
                showMirandaCase();
                break;
            case 4:
                System.out.println("Exiting Legal Case Analyzer. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }

    // ===== Case Methods =====

    public static void showTinkerCase() {
        System.out.println("Tinker v. Des Moines (1969)");
        System.out.println("\nIssue:");
        System.out.println("Whether students have the right to free speech at school.");

        System.out.println("\nDecision:");
        System.out.println("The Supreme Court ruled that students do not lose their free speech rights at school.");

        System.out.println("\nImpact:");
        System.out.println("This case established that student expression is protected as long as it does not disrupt learning.");
    }

    public static void showBrownCase() {
        System.out.println("Brown v. Board of Education (1954)");
        System.out.println("\nIssue:");
        System.out.println("Whether racial segregation in public schools was constitutional.");

        System.out.println("\nDecision:");
        System.out.println("The Supreme Court ruled that segregation in public schools is unconstitutional.");

        System.out.println("\nImpact:");
        System.out.println("This case helped end legally enforced racial segregation in schools and advanced civil rights.");
    }

    public static void showMirandaCase() {
        System.out.println("Miranda v. Arizona (1966)");
        System.out.println("\nIssue:");
        System.out.println("Whether police must inform suspects of their rights during questioning.");

        System.out.println("\nDecision:");
        System.out.println("The Supreme Court ruled that suspects must be informed of their rights before interrogation.");

        System.out.println("\nImpact:");
        System.out.println("This case led to the creation of the Miranda warning used by law enforcement today.");
    }
}
