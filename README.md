# JavaBankQueue
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabaqueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author carlc
 */
class Customer {
    private static int counter = 1;
    private int number;
    private String name;

    public Customer(String name) {
        this.name = name;
        this.number = counter++;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Customer #" + number + ": " + name;
    }
}
public class JavaBaqueue {
 private static Queue<Customer> customerQueue = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         boolean running = true;

        while (running) {
            displayMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    serveCustomer();
                    break;
                case 3:
                    viewQueue();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Bank Queue Menu ===");
        System.out.println("1. Add customer to queue");
        System.out.println("2. Serve next customer");
        System.out.println("3. View queue");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a number between 1 and 4: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void addCustomer() {
        System.out.print("Enter customer's name: ");
        scanner.nextLine(); // consume leftover newline
        String name = scanner.nextLine();
        Customer newCustomer = new Customer(name);
        customerQueue.add(newCustomer);
        System.out.println(newCustomer + " has been added to the queue.");
        viewQueue();
    }

    private static void serveCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers to serve.");
        } else {
            Customer servedCustomer = customerQueue.poll();
            System.out.println("Now serving: " + servedCustomer);
        }
        viewQueue();
    }

    private static void viewQueue() {
        System.out.println("\nCurrent queue status:");
        if (customerQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            for (Customer c : customerQueue) {
                System.out.println(c);
            }
        }
    }
}
    

     
