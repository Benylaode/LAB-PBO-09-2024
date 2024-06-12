package id.rezka.tuprak9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Home Scene
        BorderPane homeLayout = new BorderPane();
        Label homeLabel = new Label("Home Profile");
        Button toProfileButton = new Button("Go to Profile");
        toProfileButton.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

        VBox homeCenterLayout = new VBox(400, homeLabel, toProfileButton);
        homeCenterLayout.setAlignment(Pos.BASELINE_CENTER);

        homeLayout.setCenter(homeCenterLayout);

        // Add background image
        ImageView backgroundImageView = null;
        try {
            FileInputStream backgroundStream = new FileInputStream("src/main/resources/IMG_1320(1).JPG");
            Image backgroundImage = new Image(backgroundStream);
            backgroundImageView = new ImageView(backgroundImage);
            backgroundImageView.setFitWidth(600);
            backgroundImageView.setFitHeight(600);
            backgroundImageView.setPreserveRatio(false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StackPane homeRoot = new StackPane();
        if (backgroundImageView != null) {
            homeRoot.getChildren().add(backgroundImageView);
        }
        homeRoot.getChildren().add(homeLayout);

        Scene homeScene = new Scene(homeRoot, 600, 600);

        // Profile Scene
        BorderPane profileLayout = new BorderPane();
        profileLayout.setStyle("-fx-background-color: #D3D3D3;");

        Label profileLabel = new Label("Profile Scene");

        Label nameLabel = new Label("Nama Pengguna : Muhammad Faiz Ehsan");
        Label nimLabel = new Label("NIM : H071231081");
        Label emailLabel = new Label("Email : faizehsan@gmail.com");

        ImageView profileImageView = null;
        try {
            FileInputStream profileImageStream = new FileInputStream("src/main/resources/ehsan.jpg");
            Image profileImage = new Image(profileImageStream);
            profileImageView = new ImageView(profileImage);
            profileImageView.setFitWidth(400);
            profileImageView.setFitHeight(400);
            profileImageView.setPreserveRatio(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        VBox profileInfo = new VBox(10);
        if (profileImageView != null) {
            profileInfo.getChildren().add(profileImageView);
        }
        profileInfo.getChildren().addAll(nameLabel, nimLabel, emailLabel);
        profileInfo.setAlignment(Pos.CENTER);

        Button toHomeButton = new Button("Back to Home");
        VBox profileBottomLayout = new VBox(10, toHomeButton);
        profileBottomLayout.setAlignment(Pos.CENTER);

        profileLayout.setTop(profileLabel);
        BorderPane.setAlignment(profileLabel, Pos.CENTER);
        profileLayout.setCenter(profileInfo);
        profileLayout.setBottom(profileBottomLayout);
        Scene profileScene = new Scene(profileLayout, 600, 600);

        // Button Actions
        toProfileButton.setOnAction(e -> primaryStage.setScene(profileScene));
        toHomeButton.setOnAction(e -> primaryStage.setScene(homeScene));

        primaryStage.setTitle("User Profile");

        // Set Icon
        try {
            FileInputStream iconStream = new FileInputStream("src/main/resources/sisfouh.png");
            Image icon = new Image(iconStream);
            primaryStage.getIcons().add(icon);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        primaryStage.setScene(homeScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
