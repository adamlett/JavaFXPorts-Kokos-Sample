package javafxports.org.kokos;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Created by johan on 12/3/14.
 */
public class SomeBox extends VBox {

    public SomeBox() {
        Label l1 = new Label ("Line 1 in vbox");
        Label l2 = new Label("line 2 in vbox");
        this.getChildren().addAll(l1,l2);
    }
}
