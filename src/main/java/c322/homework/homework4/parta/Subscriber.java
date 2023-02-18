package c322.homework.homework4.parta;

public class Subscriber implements Observer{
    private String name;
    private Subject forum;

    public Subscriber(String name, Subject forum) {
        this.name = name;
        this.forum = forum;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }

    public void unsubscribe() {
        forum.removeObserver((java.util.Observer) this);
    }
}
