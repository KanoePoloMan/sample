package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ConvertBtn;

    @FXML
    private Button systemBtn_1;

    @FXML
    private TextField FolderForInput;

    @FXML
    private Button systemBtn2;

    @FXML
    private TextField FolderForOutput;

    @FXML
    void initialize() {
        assert ConvertBtn != null : "fx:id=\"ConvertBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert systemBtn_1 != null : "fx:id=\"systemBtn_1\" was not injected: check your FXML file 'sample.fxml'.";
        assert FolderForInput != null : "fx:id=\"FolderForInput\" was not injected: check your FXML file 'sample.fxml'.";
        assert systemBtn2 != null : "fx:id=\"systemBtn2\" was not injected: check your FXML file 'sample.fxml'.";
        assert FolderForOutput != null : "fx:id=\"FolderForOutput\" was not injected: check your FXML file 'sample.fxml'.";

    }
}



