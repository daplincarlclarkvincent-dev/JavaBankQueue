import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Bank Queue Menu ======");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    bankQueue.addCustomer(name);
                    break;
                case 2:
                    bankQueue.serveCustomer();
                    break;
                case 3:
                    bankQueue.viewQueue();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
