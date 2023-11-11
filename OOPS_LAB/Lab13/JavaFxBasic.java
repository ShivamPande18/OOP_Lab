import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

        // Set action on button click
        btn.setOnAction(e -> {
            System.out.println("Button clicked!");
        });

        // Create a layout and add the button to it
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Create the scene
        Scene scene = new Scene(root, 300, 250);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
