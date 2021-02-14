import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainWindow implements EventHandler<ActionEvent> {

	private Button bt_Plus = new Button("Increment");
	private Label lbl_value = new Label("value = 0");
    private Button bt_Minus = new Button("Decrement");
	
    private int value = 0;
    
	public Scene getInitialScene() {
		
        bt_Plus.setOnAction(this);
        bt_Minus.setOnAction(this);
        
        VBox placement = new VBox();
        
        placement.getChildren().add(bt_Plus);
        placement.getChildren().add(lbl_value);
        placement.getChildren().add(bt_Minus);
        
        Scene initial_scene = new Scene(placement, 300, 250);
		return initial_scene;
	}
	
	@Override
    public void handle(ActionEvent event) {
		if (event.getSource() == bt_Plus) value++;
		else if (event.getSource() == bt_Minus) value--;
		
        lbl_value.setText("Value = " + value);
    }
	
}
