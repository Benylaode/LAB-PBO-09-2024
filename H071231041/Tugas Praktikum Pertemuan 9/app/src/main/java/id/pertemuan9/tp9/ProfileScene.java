package id.pertemuan9.tp9;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfileScene {
    private Stage stage;
    private Scene scene;
    private App mainApp;

    public ProfileScene(Stage stage, App mainApp) {
        this.stage = stage;
        this.mainApp = mainApp;
        createScene();
    }

    private void createScene() {
        VBox layout = new VBox(20);
        layout.setId("layout");

        String username = mainApp.getUsername();
        Label nameLabel = new Label(
                "Username: " + username);
        nameLabel.setStyle(" -fx-text-fill: white;");

        ImageView profileImageView = new ImageView(new Image("/img/profile.png"));
        profileImageView.setFitWidth(100);
        profileImageView.setFitHeight(100);

        Button backButton = new Button("Back to Home");
        backButton.setId("profileButton");
        backButton.setOnAction(e -> {
            HomeScene homeScene = new HomeScene(stage, mainApp);
            stage.setScene(homeScene.getScene());
            stage.setTitle("Home");
        });

        layout.getChildren().addAll(nameLabel, profileImageView, backButton);
        scene = new Scene(layout, 1000, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/style.css").toExternalForm());
    }

    public Scene getScene() {
        return scene;
    }
}
