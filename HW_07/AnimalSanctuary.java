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



public class AnimalSanctuary extends Application { 
	
	@Override     
	public void start(Stage primaryStage) throws Exception {  
		try{ 
		//creating a Skeleton
		StackPane base = new StackPane();
		BorderPane bp  = new BorderPane();
		base.getChildren().add(bp);

		AnimalPen a1 = new AnimalPen();
		bp.setCenter(a1);



		//Configure bottom of BorderPane -HBox
		HBox bottomFormat = new HBox();
		bp.setBottom(bottomFormat);
		VBox col1  = new VBox();
		VBox col2  = new VBox();
		VBox col3  = new VBox();
		VBox col4  = new VBox();
		bottomFormat.getChildren().add(col1);
		bottomFormat.getChildren().add(col2);
		bottomFormat.getChildren().add(col3);
		bottomFormat.getChildren().add(col4);

		//column 1
		TextField name = new TextField();
		col1.getChildren().addAll(new Label("Type name here"), name);

	   	//column 2
		TextField health = new TextField();
		col2.getChildren().addAll(new Label("Type health Here"), health);

		//column 3

		ComboBox<String> animalTypeDropDown = new ComboBox<String>();
		for (Animal i: Animal.values()){
			animalTypeDropDown.getItems().add(i.toString());
		}
		col3.getChildren().addAll(new Label("Pick animal type"), animalTypeDropDown);
		


		
	   //Creating a Scene by passing the group object, height and width   
	   
		//setting color to the scene 
		BackgroundImage bImg = new BackgroundImage(new Image("animalImage.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, null, new BackgroundSize(1.0, 1.0, true, true, false, false));
		base.setBackground(new Background(bImg)); 
	
		
	
		//Set alignment & spacing & style
		base.setAlignment(Pos.CENTER);
		bottomFormat.setAlignment(Pos.CENTER);
		col1.setAlignment(Pos.CENTER);
		col2.setAlignment(Pos.CENTER);
		col3.setAlignment(Pos.CENTER);
		col4.setAlignment(Pos.CENTER);
		
		col1.setPadding(new Insets(10));

		col1.setStyle("-fx-background-color: #FFFFFF;");
	   	col2.setStyle("-fx-background-color: #FFFFFF;");
	  	col3.setStyle("-fx-background-color: #FFFFFF;");
	  	col4.setStyle("-fx-background-color: #FFFFFF;");



		//Setting the title
		primaryStage.setTitle("My Animal Sanctuary");

		//Adding the scene to Stage 
		Scene scene = new Scene(base, 1200, 560);
		primaryStage.setScene(scene); 
			
		//Displaying the contents of the stage 
		primaryStage.show(); 

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	 
	}    
	public static void main(String args[]){          
	   launch(args);     
	}         
 }
/* 
public class AnimalSanctuary extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane base = new StackPane();
		try {
		Image img = new Image("animalImage.png");
		base.getChildren.add(img);}
		catch(IllegalArgumentException) {
			System.out.println("found the problem");
		}
		bImg = new BackgroundImage(img, 
			BackgroundRepeat.NO_REPEAT,
			BackgroundRepeat.NO_REPEAT,
			BackgroundPosition.DEFAULT,
			BackgroundSize.DEFAULT);
		//base.setBackground(new Background(bImg));


		TilePane sanctuaryArea = new TilePane();
		base.getChildren().add(sanctuaryArea);
		sanctuaryArea.setAlignment(Pos.CENTER);


		Scene scene = new Scene(base);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}*/