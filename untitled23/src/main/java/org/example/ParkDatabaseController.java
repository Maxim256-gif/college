package org.example;

public class ParkDatabaseController {
    private AttractionParkDatabaseProxy dbHandle;

    public ParkDatabaseController(AttractionParkDatabaseProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addRideTicket() {
        System.out.println("Ride ticket added.");
    }
    public void removeRideTicket() {
        System.out.println("Ride ticket removed.");
    }
    public void modifyRideTicket() {
        System.out.println("Ride ticket modified.");
    }
    public void addVisitor() {
        System.out.println("Visitor added.");
    }
    public void removeVisitor() {
        System.out.println("Visitor removed.");
    }
}
