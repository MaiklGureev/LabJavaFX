package sample.AlertListeners;

import sample.EventListeners;

public class RightEyeAlertListener implements EventListeners {
    @Override
    public void updateSimpleFace(String type, String message){
        if(!type.equals("rEye"))
        System.out.println("Правый глаз получил сообщение: " + message);
        else
            System.out.println("Правый глаз изменил цвет!");
    }
}
