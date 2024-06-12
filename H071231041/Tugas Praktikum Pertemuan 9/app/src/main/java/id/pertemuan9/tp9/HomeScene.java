package id.pertemuan9.tp9;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;
    private Scene scene;
    private App mainApp;

    public HomeScene(Stage stage, App mainApp) {
        this.stage = stage;
        this.mainApp = mainApp;
        createScene();
    }

    private void createScene() {
        VBox layout = new VBox(50);
        layout.setId("layout");

        GridPane grid = new GridPane();

        TextField text = new TextField();
        text.setPrefSize(300, 30);
        grid.getChildren().add(text);
        layout.getChildren().add(grid);
        grid.setStyle("-fx-alignment: center;");

        Button profileButton = new Button("Profile");
        profileButton.setOnAction(e -> {
            String username = text.getText();
            mainApp.setUsername(username);
            ProfileScene profileScene = new ProfileScene(stage, mainApp);
            stage.setScene(profileScene.getScene());
            stage.setTitle("Profile");
        });

        layout.getChildren().add(profileButton);
        scene = new Scene(layout, 1000, 500);
        scene.getStylesheets().add(getClass().getResource("/Style/style.css").toExternalForm());
    }

    public Scene getScene() {
        return scene;
    }
}
