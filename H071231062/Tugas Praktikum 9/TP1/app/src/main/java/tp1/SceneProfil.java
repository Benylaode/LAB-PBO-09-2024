package tp1;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class SceneProfil {
    private VBox view;

    public SceneProfil() {
        initializeView();
    }

    private void initializeView() {
        User user = App.currentUser;
        Image image = new Image(getClass().getResourceAsStream("/img/" + user.getPhotoFilename()));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setClip(new Circle(50, 50, 50));

        Label profileLabel = new Label("Welcome, " + user.getUsername() + "!");
        profileLabel.setStyle("-fx-font-size: 16px; -fx-padding: 20px;");

        Button backToHomeButton = new Button("Logout");
        backToHomeButton.setOnAction(e -> App.goToHomeScene());
        backToHomeButton.setStyle("-fx-font-size: 14px; -fx-padding: 10px;");

        view = new VBox(10, imageView, profileLabel, backToHomeButton);
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #B7B597;");
    }

    public Parent getView() {
        return view;
    }
}