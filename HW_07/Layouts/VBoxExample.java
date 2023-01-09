import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/*from  www.java2s.com*/
//http://www.java2s.com/Tutorials/Java/JavaFX/0310__JavaFX_VBox.htm
public class VBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        // 5 pixels space between child nodes
        // VBox(double spacing)
        VBox vbox = new VBox(5);
        // 1 pixel padding between child nodes only
        vbox.setPadding(new Insets(1));
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(20, 100);
        Rectangle r3 = new Rectangle(50, 20);
        Rectangle r4 = new Rectangle(20, 50);

        HBox.setMargin(r1, new Insets(2, 2, 2, 2));

        vbox.getChildren().addAll(r1, r2, r3, r4);
        root.getChildren().add(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}