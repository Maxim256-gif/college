package practise.task4.part2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AttractionAlert alert1 = new AttractionAlert(AlertSeverity.HIGH, "Roller Coaster Maintenance", 101, LocalDate.now(), "Maintenance");
        AttractionAlert alert2 = new AttractionAlert(AlertSeverity.MEDIUM, "Ferris Wheel Slowdown", 102, LocalDate.now(), "Operations");
        AttractionAlert alert3 = new AttractionAlert(AlertSeverity.LOW, "Carousel Music Issue", 103, LocalDate.now(), "Audio System");

        AttractionController controller = new AttractionController();

        VisitorNotifier visitorNotifier = new VisitorNotifier("John Doe");
        MaintenanceNotifier maintenanceNotifier = new MaintenanceNotifier(5);
        OperatorNotifier operatorNotifier = new OperatorNotifier("Operator123");

        controller.subscribe(visitorNotifier);
        controller.subscribe(maintenanceNotifier);
        controller.subscribe(operatorNotifier);

        controller.addAlert(alert1);
        controller.addAlert(alert2);
        controller.addAlert(alert3);
        controller.infoAlert();

        controller.addAlert(alert1);
        controller.subscribe(maintenanceNotifier);
        controller.unsubscribe(maintenanceNotifier);
        controller.infoAlert();
    }
}
