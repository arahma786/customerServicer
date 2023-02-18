package c322.homework.homework4.parta;

import java.util.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        // create subject
        DiscussionForum forum = new DiscussionForum();

        // create observers
        Subscriber subscriber1 = new Subscriber("John", forum);
        Subscriber subscriber2 = new Subscriber("Jane", forum);
        Subscriber subscriber3 = new Subscriber("Bob", forum);

        // register observers with subject
        forum.registerObserver((Observer) subscriber1);
        forum.registerObserver((Observer) subscriber2);
        forum.registerObserver((Observer) subscriber3);

        // simulate changes to the subject
        forum.postMessage("New topic posted!");
        subscriber2.unsubscribe();
        forum.postMessage("Another topic posted!");
    }
}
