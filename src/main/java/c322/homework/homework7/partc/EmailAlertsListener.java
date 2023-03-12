package c322.homework.homework7.partc;

public class EmailAlertsListener implements EventListeners {
    @Override
    public void update(String filename) {

        System.out.println("Email alert sent for file: " + filename);
    }
}
