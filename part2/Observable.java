package practise.task4.part2;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> _observers = new ArrayList<>();

    public void notify(AttractionAlert alert) {
        for (Observer observer : _observers) {
            observer.notify(alert);
        }
    }

    public void subscribe(Observer observer) {
        _observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        _observers.remove(observer);
    }
}
