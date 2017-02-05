package javafxports.org.kokos;

import android.net.wifi.p2p.WifiP2pManager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Created by johan on 12/3/14.
 */
public class MyFxApp extends Application {

    @Override
    public void start (Stage stage) throws Exception {
        final Button b = new Button("Click JavaFX");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("CLICKED!");
                b.setText("YOU CLICKED");
            }
        });
        double w = stage.getWidth();
        double h = stage.getHeight();
        Screen primaryScreen = Screen.getPrimary();
        Rectangle2D visualBounds = primaryScreen.getVisualBounds();
        double width = visualBounds.getWidth();
        double height = visualBounds.getHeight();
        System.out.println("[JVDBGFRAG] w = "+w+", b = "+b+", width = "+width+", height = "+height);
        Scene s = new Scene(b,width,height);
        s.setFill(Color.ALICEBLUE);
        stage.setScene(s);
        stage.show();
    }
}
