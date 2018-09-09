package wirus;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Random;

public class Main extends Application {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double y = screenSize.getHeight();
    double x = screenSize.getWidth();

    public static void main(String[] args) {
        launch();

    }

    public void start(Stage primaryStage) throws Exception {

        for (int i = 0; i < 100; i++) {
            generateAlert(generateXPos(), generateYPos());
        }
    }

    private void generateAlert(int posX, int posY) {
        Alert alert = new Alert(Alert.AlertType.ERROR, "EASY", ButtonType.YES, ButtonType.NO);
        alert.setTitle("UMC UMC UMC");
        alert.setX(posX);
        alert.setY(posY);
        alert.setHeaderText("HACKED!");
        alert.setOnCloseRequest(new EventHandler<DialogEvent>() {
            public void handle(DialogEvent event) {
                for (int i = 0; i < 10; i++) {
                    generateAlert(generateXPos(), generateYPos());
                }
            }
        });
        alert.show();
        if (alert.getResult() == ButtonType.YES) {
            for (int i = 0; i < 10; i++) {
                generateAlert(generateXPos(), generateYPos());
            }

        }
        if (alert.getResult() == ButtonType.NO) {
            for (int i = 0; i < 10; i++) {
                generateAlert(generateXPos(), generateYPos());
            }

        }
    }

    public int generateXPos() {
        Random rnd = new Random();
        return rnd.nextInt((int) x);
    }

    public int generateYPos() {
        Random rnd = new Random();
        return rnd.nextInt((int) y);
    }

}
