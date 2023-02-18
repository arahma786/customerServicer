package c322.homework.homework4.parta;

import java.util.ArrayList;
import java.util.List;

public class DiscussionForum implements Subject{
    private List<Observer> observers;
    private String message;

    public DiscussionForum() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(java.util.Observer observer) {
        observers.add((Observer) observer);
    }

    @Override
    public void removeObserver(java.util.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void postMessage(String message) {
        this.message = message;
        notifyObservers(message);
    }
}
