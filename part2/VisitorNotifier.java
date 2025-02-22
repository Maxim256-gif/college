package practise.task4.part2;

public class VisitorNotifier implements Observer {
    private String _visitorName;

    public VisitorNotifier(String visitorName) {
        this._visitorName = visitorName;
    }

    @Override
    public void notify(AttractionAlert alert) {
        System.out.println(alert.toString() + " visitor notification sent to " + this._visitorName);
    }
}
