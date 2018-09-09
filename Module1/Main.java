import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application{

	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage)
	{  
		Label greeting = new Label("Call Attendant");
  
		Font f1 = new Font("Sanserif", 14);
		Font f3 = new Font("Verdana", 18);
		    
		greeting.setFont(f3);  
		    
		TextField txtBox1 = new TextField();
		txtBox1.setText("Light off");
		TextField txtBox2 = new TextField();
		txtBox2.setText("Light off");
		TextField txtBox3 = new TextField();
		txtBox3.setText("Light off");
		TextField txtBox4 = new TextField();
		txtBox4.setText("Light off");
		TextField txtBox5 = new TextField();
		txtBox5.setText("Light off");
		 
		Button seat1btn = new Button("Seat1"); 
		seat1btn.setFont(f1);
		seat1btn.setMinWidth(50);
		seat1btn.setOnAction(e -> {
			txtBox1.setText("Light on");		 
		});
		 
		Button seat2btn = new Button("Seat2"); 
		seat2btn.setFont(f1);
		seat2btn.setMinWidth(50);
		seat2btn.setOnAction(e -> {
			txtBox2.setText("Light on");		 
		});
		
		Button seat3btn = new Button("Seat3"); 
		seat3btn.setFont(f1);
		seat3btn.setMinWidth(50);
		seat3btn.setOnAction(e -> {
			txtBox3.setText("Light on");		 
		});
		
		Button seat4btn = new Button("Seat4"); 
		seat4btn.setFont(f1);
		seat4btn.setMinWidth(50);
		seat4btn.setOnAction(e -> {
			txtBox4.setText("Light on");		 
		});
		
		Button seat5btn = new Button("Seat5"); 
		seat5btn.setFont(f1);
		seat5btn.setMinWidth(50);
		seat5btn.setOnAction(e -> {
			txtBox5.setText("Light on");		 
		});
		
		Button clearbtn = new Button("Clear"); 
		clearbtn.setFont(f1);
		clearbtn.setMinWidth(50);
		clearbtn.setOnAction(e -> {
			txtBox1.setText("Light off");
			txtBox2.setText("Light off");
			txtBox3.setText("Light off");
			txtBox4.setText("Light off");
			txtBox5.setText("Light off");
		});
		  
		HBox horizontalBox = new HBox();   
		horizontalBox.getChildren().addAll(seat1btn, seat2btn, seat3btn, seat4btn, seat5btn, clearbtn);
		horizontalBox.setSpacing(10);
		horizontalBox.setPadding(new Insets(10, 10, 10, 10));
		 
		VBox verticleBox = new VBox();
		verticleBox.getChildren().addAll(greeting,  txtBox1, txtBox2, txtBox3, txtBox4, txtBox5, horizontalBox);
		verticleBox.setSpacing(10);
		verticleBox.setPadding(new Insets(20, 10, 10, 20));
		 
		Scene scene = new Scene(verticleBox, 450, 450); 
		stage.setScene(scene);
		stage.setTitle("Call Attendant");
		stage.show(); 
	}

}
