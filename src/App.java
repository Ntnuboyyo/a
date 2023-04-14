import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.*;

import javafx.scene.control.Button;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        System.out.println("Application starting up!");
        Application.launch(args);
        
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI.fxml"));
        VBox root = (VBox) loader.load();
        Scene scene = new Scene(root);
        Button button = new Button();
        button.setOnMouseClicked(event ->  {
            Button pagebutton = new Button();
            //pagebutton.
            
         });
        stage.setScene(scene);
        stage.show();
    	/*
            Object m = new Object();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
            TabPane mainPane = loader.load();
            Scene scene = new Scene(mainPane);
            stage.setScene(scene);
            stage.show();
            */
        /*
        TabPane mainPane = new TabPane();
        //SplitPane vbox = new SplitPane();
        //MenuBar mb = new MenuBar();
        Scene scene = new Scene(mainPane,500,500);
        stage.setScene(scene);
        stage.show();
        */
    }
}
