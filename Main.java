import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
    	stage.setTitle("My Java Fx Window !");
    	
    	MainWindow window = new MainWindow();
    	Scene initial_scene = window.getInitialScene();
  	
        stage.setScene(initial_scene);
        stage.show();
    }
}
