package wirus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {
    public static void main(String[] args) {
        launch();

    }

    public void start(Stage primaryStage) throws Exception {

        for(int i = 0; i < 1000; i++) {
            generateAlert(generateNumber(), generateNumber());
        }
    }

    private void generateAlert(int posX, int posY) {
        Alert alert = new Alert(Alert.AlertType.WARNING, "UMC UMC UMC ", ButtonType.YES, ButtonType.NO);
        alert.setTitle("YOU HAVE BEEN HACKED");
        alert.setX(posX);
        alert.setY(posY);
        alert.show();
        if (alert.getResult() == ButtonType.YES) {
            System.out.println("asdasd");
        }
    }

    public int generateNumber(){
        Random rnd = new Random();
        return rnd.nextInt(2000);
    }

}
