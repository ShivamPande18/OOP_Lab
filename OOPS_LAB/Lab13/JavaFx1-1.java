import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VerticalDirection;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Data extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Example");

        // Create a button
        Button btn = new Button();
        btn.setText("Click me!");

        Label label = new Label();
        label.setText("First Java Fx Application");
        label.setTextFill(Color.MAGENTA);

        // Set action on button click
        btn.setOnAction(e -> {
            System.out.println("Btn!");
        });

        // Create a layout and add the button to it
        FlowPane root = new FlowPane(Orientation.VERTICAL);
        root.setAlignment(Pos.CENTER);
        root.maxWidth(500);
        root.setHgap(20);
        root.setVgap(20);
        root.setColumnHalignment(HPos.CENTER);
        root.setPrefWrapLength(500);
        root.getChildren().addAll(label,btn);

        // Create the scene
        Scene scene = new Scene(root, 500, 200);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
