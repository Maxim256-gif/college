package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IAttractionParkDatabaseDriverAdapter adapter = new RollerCoasterParkDatabaseAdapter();
        AttractionParkDatabaseAccess access = new AttractionParkDatabaseAccess(adapter);
        AttractionParkDatabaseProxy proxy = new AttractionParkDatabaseProxy(access);
        ParkDatabaseController controller = new ParkDatabaseController(proxy);

        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Attraction Park Console --");
        while (true) {
            System.out.println("1. Add Ride Ticket");
            System.out.println("2. Remove Ride Ticket");
            System.out.println("3. Modify Ride Ticket");
            System.out.println("4. Add Visitor");
            System.out.println("5. Remove Visitor");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.addRideTicket();
                    break;
                case 2:
                    controller.removeRideTicket();
                    break;
                case 3:
                    controller.modifyRideTicket();
                    break;
                case 4:
                    controller.addVisitor();
                    break;
                case 5:
                    controller.removeVisitor();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}