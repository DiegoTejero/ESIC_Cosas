import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("operaciones.fxml "));
            Pane ventana = (Pane) loader.load();

            // Muestra el contenido de la escena.
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setTitle("CALCULADORA");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}
