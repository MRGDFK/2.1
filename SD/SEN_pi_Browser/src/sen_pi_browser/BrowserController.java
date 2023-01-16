/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sen_pi_browser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author MRGDFK
 */
public class BrowserController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField srcField;

    @FXML
    private WebView webView;

    @FXML
    void loadPage(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
