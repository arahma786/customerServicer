package c322.homework.homework7.partc;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private Map<String, EventListeners> listenersMap;

    public EventManager() {
        listenersMap = new HashMap<>();
    }

    public void subscribe(String eventType, EventListeners listener) {
        listenersMap.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListeners listener) {
        listenersMap.remove(eventType, listener);
    }

    public void notify(String eventType, String data) {
        EventListeners listener = listenersMap.get(eventType);
        if (listener != null) {
            listener.update(data);
        }
    }
}
