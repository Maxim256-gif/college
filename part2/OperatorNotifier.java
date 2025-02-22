package practise.task4.part2;

public class OperatorNotifier implements Observer {
    private String _operatorName;

    public OperatorNotifier(String operatorName) {
        this._operatorName = operatorName;
    }

    @Override
    public void notify(AttractionAlert alert) {
        System.out.println(this._operatorName + " notified about issue: " + alert.toString());
    }
}
