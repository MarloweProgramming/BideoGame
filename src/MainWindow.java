// java fxml imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;

// java objects and library imports
import java.util.*;
import java.io.IOException;

// model imports
import model.worldObjects.World;


// main window is where start/load game is selected. when start game is clicked, pop up a pane of the world that allows the user to pick where they want to start in the world
public class MainWindow {

    @FXML
    VBox MainVBox; // may be helpful if texture pack shop is implemented

    @FXML
    public void onNewGameClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GameWindow.fxml"));
        Scene scene = new Scene(loader.load());
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent k) {
                if (k.getEventType() == KeyEvent.KEY_PRESSED) {
                    switch (k.getCode()) {
                        case W:
                            GameWindow.moveUp();
                            break;
                        case A:
                            GameWindow.moveLeft();
                            break;
                        case S:
                            GameWindow.moveDown();
                            break;
                        case D:
                            GameWindow.moveRight();
                            break;
                        default:
                            break;
                    }
                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent k) {
                if (k.getEventType() == KeyEvent.KEY_RELEASED) {
                    switch (k.getCode()) {
                        case W:
                            GameWindow.stopUp();
                            break;
                        case A:
                            GameWindow.stopLeft();
                            break;
                        case S:
                            GameWindow.stopDown();
                            break;
                        case D:
                            GameWindow.stopRight();
                            break;
                        default:
                            break;
                    }
                }
            }
        });

        Menu m = new Menu();


        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }
    
    @FXML
    public void onLoadGameClicked(ActionEvent event) {

    }

    @FXML
    public void onSettingsClicked(ActionEvent event) {

    }

    @FXML
    public void onCreditsClicked(ActionEvent event) {

    }
    // method that runs when the app is loaded
    @FXML
    public void initialize() {
        
    }
}
