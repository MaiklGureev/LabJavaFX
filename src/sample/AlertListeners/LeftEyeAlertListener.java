package sample.AlertListeners;

import sample.EventListeners;

public class LeftEyeAlertListener implements EventListeners {
    @Override
    public void updateSimpleFace(String type, String message) {
        if(!type.equals("lEye"))
            System.out.println("Левый глаз получил сообщение: " + message);
        else
            System.out.println("Левый глаз изменил цвет!");
    }
}
