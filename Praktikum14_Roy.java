/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14_roy;

import java.util.HashSet;
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Praktikan
 */
public class Praktikum14_Roy extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();

//        Button btn = new Button("Click Me!");
//        Label txt = new Label("");
//        
//        btn.setOnAction(new EventHandler<ActionEvent>(){
//        
//        @Override
//        public void handle(ActionEvent event){
//            if(txt.getText() == ""){
//                txt.setText("Hello World!");
//            }else{
//                txt.setText("");
//            }
//        }
//    });
//        
//        VBox root = new VBox();
//        root.getChildren().add(btn);
//        root.getChildren().add(txt);
//        root.setAlignment(Pos.CENTER);
//        
//        
//        Scene scene = new Scene(root);
//        
//        stage.setHeight(300);
//        stage.setWidth(300);
        stage.setScene(scene);
        stage.setTitle("RoyRaflesMatorangPasaribu_2117051058");
        stage.show();
//        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
