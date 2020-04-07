package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import sample.AlertListeners.LeftEyeAlertListener;
import sample.AlertListeners.MouthAlertListener;
import sample.AlertListeners.NoseAlertListener;
import sample.AlertListeners.RightEyeAlertListener;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle face;

    @FXML
    private Ellipse nose;

    @FXML
    private Circle leftEye;

    @FXML
    private Circle rightEye;

    @FXML
    private Polygon mouth;

    Paint eyeColorBase;
    Paint eyeColorChanged;

    Paint noseColorBase;
    Paint noseColorChanged;

    double mouthXBase;
    double mouthYBase;

    double mouthXChanged;
    double mouthYChanged;

    EventListeners eventListenerLeftEye =  new LeftEyeAlertListener();
    EventListeners eventListenerRightEye =  new RightEyeAlertListener();
    EventListeners eventListenerNose =  new NoseAlertListener();
    EventListeners eventListenerMouth =  new MouthAlertListener();

    EventManager eventManager = new EventManager();


    @FXML
    void OnLeftEyeClick(MouseEvent event) {
        eventManager.notify("lEye",  "левый глаз был перекрашен.");
        if (leftEye.fillProperty().getValue().equals(eyeColorBase)) {
            leftEye.fillProperty().setValue(eyeColorChanged);
        } else {
            leftEye.fillProperty().setValue(eyeColorBase);
        }
    }

    @FXML
    void OnRightEyeClick(MouseEvent event) {
        eventManager.notify("rEye",  "правый глаз был перекрашен.");
        if (rightEye.fillProperty().getValue().equals(eyeColorBase)) {
            rightEye.fillProperty().setValue(eyeColorChanged);
        } else {
            rightEye.fillProperty().setValue(eyeColorBase);
        }
    }

    @FXML
    void OnMouthClick(MouseEvent event) {
        eventManager.notify("mouth",  "рот был изменён.");
        if(mouth.getPoints().get(4) == mouthXBase & mouth.getPoints().get(5) == mouthYBase){
            mouth.getPoints().set(4, mouthXChanged);
            mouth.getPoints().set(5, mouthYChanged);
        }
        else {
            mouth.getPoints().set(4, mouthXBase);
            mouth.getPoints().set(5, mouthYBase);
        }



    }

    @FXML
    void OnNoseClick(MouseEvent event) {
        eventManager.notify("nose",  "нос был перекрашен.");
        if (nose.fillProperty().getValue().equals(noseColorBase)) {
            nose.fillProperty().setValue(noseColorChanged);
        } else {
            nose.fillProperty().setValue(noseColorBase);
        }
    }


    @FXML
    void initialize() {

        eventManager.addListener(eventListenerLeftEye);
        eventManager.addListener(eventListenerRightEye);
        eventManager.addListener(eventListenerNose);
        eventManager.addListener(eventListenerMouth);

        eyeColorBase = leftEye.fillProperty().getValue();
        eyeColorChanged = face.fillProperty().getValue();

        noseColorBase = nose.fillProperty().getValue();
        noseColorChanged = Color.RED;

        mouthXBase = mouth.getPoints().get(4);
        mouthYBase = mouth.getPoints().get(5);

        mouthXChanged = -56;
        mouthYChanged = -30;
    }

}
