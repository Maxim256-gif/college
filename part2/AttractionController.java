package practise.task4.part2;

import java.util.ArrayList;

public class AttractionController extends Observable {
    private ArrayList<AttractionAlert> _alertHistory = new ArrayList<>();

    public AttractionController() {}

    public void infoAlert() {
        if (!_alertHistory.isEmpty()) {
            for (AttractionAlert alert : _alertHistory) {
                notify(alert);
            }
            _alertHistory.clear();
        } else {
            System.out.println("No alerts in history.");
        }
    }

    public void addAlert(AttractionAlert alert) {
        _alertHistory.add(alert);
    }
}
