package sample.AlertListeners;

import sample.EventListeners;

public class NoseAlertListener implements EventListeners {
    @Override
    public void updateSimpleFace(String type, String message) {
        if(!type.equals("nose"))
            System.out.println("Нос получил сообщение: " + message);
        else
            System.out.println("Нос изменил цвет!");
    }
}
