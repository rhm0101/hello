import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Hello extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();
    root.setCenter(new Label("Hello World"));
    Scene scene = new Scene(root, 200, 100);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
