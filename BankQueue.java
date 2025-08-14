import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Customer> queue;

    public BankQueue() {
        queue = new LinkedList<>();
    }

    public void addCustomer(String name) {
        Customer newCustomer = new Customer(name);
        queue.offer(newCustomer);
        System.out.println("\nAdded to queue: " + newCustomer);
    }

    public void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("\nNo customers to serve.");
        } else {
            Customer served = queue.poll();
            System.out.println("\nServing customer: " + served);
        }
    }

    public void viewQueue() {
        if (queue.isEmpty()) {
            System.out.println("\nQueue is empty.");
        } else {
            System.out.println("\nCurrent Queue:");
            for (Customer customer : queue) {
                System.out.println(customer);
            }
        }
    }
}
