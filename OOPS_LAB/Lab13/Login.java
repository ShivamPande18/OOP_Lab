import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Data extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Page");

        // Create UI components
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Label roleLabel = new Label("Select Role:");
        ComboBox<String> roleComboBox = new ComboBox<>();
        roleComboBox.getItems().addAll("Admin", "User", "Guest");
        roleComboBox.setPromptText("Select Role");

        Label loginTypeLabel = new Label("Login Type:");
        ToggleGroup loginTypeToggleGroup = new ToggleGroup();
        RadioButton normalLoginRadio = new RadioButton("Normal Login");
        RadioButton guestLoginRadio = new RadioButton("Guest Login");
        normalLoginRadio.setToggleGroup(loginTypeToggleGroup);
        guestLoginRadio.setToggleGroup(loginTypeToggleGroup);
        normalLoginRadio.setSelected(true); // Default selection

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String selectedRole = roleComboBox.getValue();
            RadioButton selectedRadioButton = (RadioButton) loginTypeToggleGroup.getSelectedToggle();
            String loginType = selectedRadioButton.getText();

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Role: " + selectedRole);
            System.out.println("Login Type: " + loginType);
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);

        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        gridPane.add(roleLabel, 0, 2);
        gridPane.add(roleComboBox, 1, 2);

        gridPane.add(loginTypeLabel, 0, 3);
        gridPane.add(normalLoginRadio, 1, 3);
        gridPane.add(guestLoginRadio, 1, 4);

        gridPane.add(loginButton, 1, 5);

        Scene scene = new Scene(gridPane, 300, 250);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
