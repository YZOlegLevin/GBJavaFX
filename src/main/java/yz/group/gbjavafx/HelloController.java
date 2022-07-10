package yz.group.gbjavafx;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {
    private String correspondence = "";
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField massage;
//

    @FXML
    private TextArea outputText;

    @FXML
    private Button sendButton;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date();
        if (massage.getText().length() != 0) {
            correspondence += DateFormat.getTimeInstance().format(currentTime) + "\t" + massage.getText() + "\n";
            outputText.setText(correspondence);
            massage.setText("");
        }


    }

    @FXML
    void massEnt(ActionEvent event) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date();
        if (massage.getText().length() != 0) {
            correspondence += DateFormat.getTimeInstance().format(currentTime) + "\t" + massage.getText() + "\n";
            outputText.setText(correspondence);
            massage.setText("");
        }
    }

    @FXML
    void initialize() {
        assert massage != null : "fx:id=\"massage\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert outputText != null : "fx:id=\"outputText\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert sendButton != null : "fx:id=\"sendButton\" was not injected: check your FXML file 'hello-view.fxml'.";

    }


}