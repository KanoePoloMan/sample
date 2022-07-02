package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main /*extends Application*/ {

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pictures converter");
        primaryStage.setScene(new Scene(root, 300, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }*/


    public static void main(String[] args) {
        //launch(args);
        FilePath filePath = new FilePath();
        //System.out.print("test");
        ReadFromFile2 readFromFile2 = new ReadFromFile2();
        //filePath.FilePathMethod("");
        readFromFile2.ReadFromFileObject(filePath.getFilePath());

    }
}
