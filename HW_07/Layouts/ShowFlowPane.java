import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    static private BorderPane createLabelledInputPane(String labelText) {
        BorderPane bp = new BorderPane();
        bp.setLeft(new Label(labelText));
        bp.setRight(new TextField());
        bp.setStyle("-fx-border-style: dashed");
        
        return bp;
    }
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        FlowPane pane = new FlowPane();
        // the amount of space around the outside of the pane:
        //(double top, double right, double bottom, double left)
        Insets insets = new Insets(30, 15, 13, 50);
        pane.setPadding(insets);
        // amount of horizontal gap between nodes
        pane.setHgap(5);
        // amount of vertical gap between nodes
        pane.setVgap(5);

        // Place nodes in the pane
/*        pane.getChildren().addAll(new Label("First Name:"),
                new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"),
                new TextField());
*/                

        pane.getChildren().addAll(createLabelledInputPane("First Name:"), 
                                  createLabelledInputPane("MI:"), 
                                  createLabelledInputPane("Last Name:"));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("ShowFlowPane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
