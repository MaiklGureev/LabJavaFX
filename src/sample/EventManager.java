package sample;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    List <EventListeners> eventListeners = new ArrayList<>();

    public void addListener(EventListeners eventListener){
                eventListeners.add(eventListener);
    }

    public void notify(String typeMessage, String message){
        for (EventListeners listener:eventListeners) {
                listener.updateSimpleFace(typeMessage,message);
        }
        System.out.println("------------------------------------------------");
    }
}
