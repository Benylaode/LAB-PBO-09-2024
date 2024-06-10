package id.kezia.tugaspraktikum9;

// import id.kezia.tugaspraktikum9.scenes.ProfileScene;
import javafx.application.Application;
// import javafx.geometry.Insets;
import javafx.geometry.Pos;
// import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
    
    private Stage stage;
    String nama, pekerjaan;
    int umur;

    @Override
    public void start(Stage primmaryStage) throws Exception {
        stage = primmaryStage;
        showHomeScene();
        stage.show();
    }

    public void  showHomeScene() {
        Text text = new Text("Selamat Datang");
        text.setStyle("-fx-font-size: 30px; -fx-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");

        Label labelUsername = new Label("Username: " );
        TextField userField = new TextField();
        labelUsername.setStyle("-fx-font-size: 15px; -fx-text-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");

        Label labelUmur = new Label("Umur: ");
        TextField umurField = new TextField();
        labelUmur.setStyle("-fx-font-size: 15px; -fx-text-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");

        Label labelPekerjaan = new Label("Pekerjaan: ");
        TextField pekerjaanField = new TextField();
        labelPekerjaan.setStyle("-fx-font-size: 15px; -fx-text-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");

        Button btnprofile = new Button("Show profile");
        btnprofile.setOnAction(e ->{
            try {
                nama = userField.getText();
                umur = Integer.parseInt(umurField.getText());
                pekerjaan = pekerjaanField.getText();
                showProfileScene();

            } catch (Exception ex) {
                text.setText("Silakan isi dengan benar");
            }
            
        });

        Button btnLogout = new Button("Logout");
        btnLogout.setOnAction(e -> {
            showHomeScene();
        });

        
        GridPane grid = new GridPane(); 
        grid.setVgap(5);
        grid.add(labelUsername, 0, 1);
        grid.add(userField, 1, 1);

        grid.add(labelUmur, 0, 2);
        grid.add(umurField, 1, 2);

        grid.add(labelPekerjaan, 0, 3);
        grid.add(pekerjaanField, 1, 3);
        grid.setAlignment(Pos.CENTER);

        HBox hBox = new HBox(20, btnLogout, btnprofile);
        hBox.setAlignment(Pos.CENTER);

        VBox mainView = new VBox(10, text, grid, hBox);
        mainView.setAlignment(Pos.CENTER);
        mainView.setStyle("-fx-background-color: #FFC0CB");

        Scene homeScene = new Scene(mainView, 640, 480);
        stage.setScene(homeScene);
    }

    public void showProfileScene() {
        Text text = new Text("Detail Profile");
        text.setStyle("-fx-font-size: 30px; -fx-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");
        Text namaText = new Text("Nama: " + nama);
        namaText.setStyle("-fx-font-size: 15px; -fx-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");
        Text umurText = new Text("Umur: " + umur);
        umurText.setStyle("-fx-font-size: 15px; -fx-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");
        Text pekerjaanText = new Text("Pekerjaan: " + pekerjaan);
        pekerjaanText.setStyle("-fx-font-size: 15px; -fx-fill: #89CFF0; -fx-font-weight: bold; -fx-font-family: 'Serif' ");
        
        Image image = new Image(App.class.getResource("/foto.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        Image image2 = new Image(App.class.getResource("/foto copy.png").toExternalForm());
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
     

        VBox vBox = new VBox(15, text, namaText, umurText, pekerjaanText);
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(imageView2);
        vBox.setAlignment(Pos.CENTER); 
    
        vBox.setStyle("-fx-background-color: #FFC0CB");
        

        Scene profilScene = new Scene(vBox, 640, 480);
        stage.setScene(profilScene);
    }

    public static void main(String[] args) {
        launch();
    }
}
