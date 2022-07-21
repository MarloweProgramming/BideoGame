import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

// model imports below
import model.worldObjects.*;
import model.objects.entities.*;

public class GameWindow {

    @FXML
    Pane gamePane;

    static Player p;
    static Menu m;
    static World w;

    @FXML
    public void initialize() {
        p = new Player(0, 0);

        ImageView imgView = new ImageView(new Image("graphics/player.png"));
        imgView.setFitWidth(300);
        imgView.setFitHeight(300);
        imgView.layoutXProperty().bind(p.xProperty());
        imgView.layoutYProperty().bind(p.yProperty());
        imgView.setUserData(p);
        gamePane.getChildren().add(imgView);
    }

    public static void moveUp() {
        // p.moveUp();
        p.setMoveUp(true);
        p.move();
    }
    public static void moveLeft() {
        // p.moveLeft();
        p.setMoveLeft(true);
        p.move();
    }
    public static void moveDown() {
        // p.moveDown();
        p.setMoveDown(true);
        p.move();
    }
    public static void moveRight() {
        // p.moveRight();
        p.setMoveRight(true);
        p.move();
    }

    public static void stopUp() {
        // p.stopUp();
        p.setMoveUp(false);
        p.move();   
    }
    public static void stopLeft() {
        // p.stopLeft();
        p.setMoveLeft(false);
        p.move();
    }
    public static void stopDown() {
        // p.stopDown();
        p.setMoveDown(false);
        p.move();
    }
    public static void stopRight() {
        // p.stopRight();
        p.setMoveRight(false);
        p.move();
    }
}