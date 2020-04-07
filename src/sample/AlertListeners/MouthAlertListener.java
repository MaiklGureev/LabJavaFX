package sample.AlertListeners;

import sample.EventListeners;

public class MouthAlertListener implements EventListeners {
    @Override
    public void updateSimpleFace(String type, String message) {
        if(!type.equals("mouth"))
            System.out.println("Рот получил сообщение: " + message);
        else
            System.out.println("Рот изменил форму!");
    }
}
