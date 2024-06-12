package tp1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    private static Stage stage;
    public static List<User> users = new ArrayList<>();
    public static User currentUser;

    @Override
    public void start(Stage primaryStage) {
        App.stage = primaryStage;
        users.add(new User("meng", "meng", "meng.png"));
        users.add(new User("muflih", "123", "ME.png"));
        users.add(new User("agus", "agusjr", "kk.png"));

        goToHomeScene();
        stage.setTitle("AKU BENCI GRADLE");
        stage.show();
    }

    public static void goToHomeScene() {
        SceneHome home = new SceneHome();
        Scene scene = new Scene(home.getView(), 400, 300);
        stage.setScene(scene);
        scene.getStylesheets().add("/css/styles.css");
        
    }

    public static void goToProfileScene() {
        SceneProfil profile = new SceneProfil();
        Scene scene = new Scene(profile.getView(), 400, 300);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}