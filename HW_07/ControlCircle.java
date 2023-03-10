import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);
        
        /**** Create and register the handler ****/
        
        // Using named class
        btEnlarge.setOnAction(new EnlargeHandler());
        
        // Using anonymous inner class
        //btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
        //    public void handle(ActionEvent event) {
        //        circlePane.enlarge();
        //    }
        //});
        
        // Using lambda expression instead of anonymous inner class...
        btEnlarge.setOnAction(event -> {circlePane.enlarge(); System.out.println("ENLARGE: " + event.getSource());}
        );
        
        // how do we implement the "shrink" handler?
        btShrink.setOnAction(new ShrinkHandler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Create A scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * Event handler that to enlarge the circle pane.
     */
    //class EnlargeHandler implements EventHandler<ActionEvent> {
    //    @Override // Override the handle method
    //    public void handle(ActionEvent e) {
    //        circlePane.enlarge();
    //    }
    //}
    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override // Override the handle method
        public void handle(ActionEvent e) {
            circlePane.shrink();
        }
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
} // END OF class ControlCircle

/**
 * Pane class that contains A circle that can be enlarged and shrunk.
 */
class CirclePane extends StackPane { // default visibility -- NOT public
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ?
                circle.getRadius() - 2 : circle.getRadius());
    }
}
