package menu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle = new Text("Welcome!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("User name: ");
        grid.add(userName, 0, 1);
        
        TextField field = new TextField();
        grid.add(field, 1, 1);
        
        Label password = new Label("Password: ");
        grid.add(password, 0, 2);
        
        TextField passField = new TextField();
        grid.add(passField, 1, 2);
        
        Button btn = new Button("Sign in ");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent a) {
        		actionTarget.setFill(Color.CORAL);
        		actionTarget.setText("Button pressed");
        	}
        });
        
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}