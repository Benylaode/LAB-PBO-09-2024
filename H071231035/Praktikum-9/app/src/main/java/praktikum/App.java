package praktikum;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private static final int SCENE_WIDTH = 300;
    private static final int SCENE_HEIGHT = 500;

    @Override
    public void start(Stage primaryStage) {
        // HomeScene components
        Label homeLabel = new Label("Welcome to Home Scene");
        homeLabel.setStyle("-fx-font-weight: Times new Roman; -fx-font-size: 20px;");
        Button goToProfileButton = new Button("Go to Profile");
        goToProfileButton.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        VBox homeLayout = new VBox(20, homeLabel, goToProfileButton);
        homeLayout.setAlignment(Pos.CENTER);
        homeLayout.setStyle("-fx-background-color: #ADD8E6;");  

        // ProfileScene components
        Label profileLabel = new Label("User Profile");
        profileLabel.setStyle("-fx-font-weight: Times new Roman; -fx-font-size: 16px;");
        Label userNameLabel = new Label("Username: Zahra Salsabila");
        userNameLabel.setStyle("-fx-font-weight: Times new Roman; -fx-font-size: 16px;");

        // Correct resource path for the image
        Image profileImage = new Image(App.class.getResource("/praktikum9/gambarprofile.jpg").toExternalForm());
        // Image profileImage = new Image("file:/D:/LAB-PBO-09-2024/H071231035/Praktikum-9/app/src/main/resources/praktikum9/gambarprofile.jpg");
        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitHeight(160);
        profileImageView.setFitWidth(100);
        
        Button backButton = new Button("Back to Home");
        backButton.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
        VBox profileLayout = new VBox(15, profileLabel, userNameLabel, profileImageView, backButton);
        profileLayout.setAlignment(Pos.CENTER);
        profileLayout.setStyle("-fx-background-color: #ADD8E6;");
        Scene profileScene = new Scene(profileLayout, 300, 500);

        // Setting the initial scene
        Scene homeScene = new Scene(homeLayout, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(homeScene);
        primaryStage.setTitle("Aplikasi JavaFX");
        primaryStage.show();

        // Event handling for switching scenes
        goToProfileButton.setOnAction(e -> primaryStage.setScene(profileScene));
        backButton.setOnAction(e -> primaryStage.setScene(homeScene));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
