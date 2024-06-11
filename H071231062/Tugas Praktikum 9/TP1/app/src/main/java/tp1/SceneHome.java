package tp1;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SceneHome {
    private VBox view;

    public SceneHome() {
        initializeView();
    }

    private void initializeView() {
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            if (authenticate(usernameField.getText(), passwordField.getText())) {
                App.goToProfileScene();
            } else {
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        view = new VBox(10, usernameLabel, usernameField, passwordLabel, passwordField, loginButton);
        view.setAlignment(Pos.CENTER);
        view.setPadding(new Insets(20));
        view.setStyle("-fx-background-color: #B7B597;");
        view.setId("layarutama");
        
        
    }

    public Parent getView() {
        return view;
    }

    private boolean authenticate(String username, String password) {
        for (User user : App.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                App.currentUser = user;
                return true;
            }
        }
        return false;
    }
}