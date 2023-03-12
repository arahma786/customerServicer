package c322.homework.homework7.partc;

public class LoggingListener implements EventListeners {
    @Override
    public void update(String filename) {

        System.out.println("Logging the file change: " + filename);
    }
}
