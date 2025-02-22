package practise.task4.part2;

public class MaintenanceNotifier implements Observer {
    private int _attractionId;

    public MaintenanceNotifier(int attractionId) {
        this._attractionId = attractionId;
    }

    @Override
    public void notify(AttractionAlert alert) {
        System.out.println(alert.toString() + " maintenance notified for attraction ID " + this._attractionId);
    }
}
