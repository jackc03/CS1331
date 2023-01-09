import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AnimalPen extends TilePane{
    AnimalObject[] arr;
    VBox vbox;
    HBox hbox1;
    HBox hbox2;


    public AnimalPen(){
        vbox = new VBox();
        hbox1 = new HBox();
        hbox2 = new HBox();
        vbox.getChildren().addAll(hbox1, hbox2);

        Button b1 = new Button("Empty");
		Button b2 = new Button("Empty");
		Button b3 = new Button("Empty");
		Button b4 = new Button("Empty");
		Button b5 = new Button("Empty");
		Button b6 = new Button("Empty");


		hbox1.getChildren().add(b1);
		hbox1.getChildren().add(b2);
		hbox1.getChildren().add(b3);
		hbox2.getChildren().add(b4);
		hbox2.getChildren().add(b5);
		hbox2.getChildren().add(b6);

        b1.setPadding(new Insets(40.0));
		b2.setPadding(new Insets(40.0));
		b3.setPadding(new Insets(40.0));
		b4.setPadding(new Insets(40.0));
		b5.setPadding(new Insets(40.0));
		b6.setPadding(new Insets(40.0));

        hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);

        vbox.setSpacing(10);
		hbox1.setSpacing(10);
		hbox2.setSpacing(10);

    }

    public void addAnimal() {

    }


    class removeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            Button b = (Button) e.getSource();
            b.setText("Empty");
        }
    }
}
