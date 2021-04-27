package exemple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Button valider;
    @FXML private TextField saisieN;
    @FXML private TextField repN;

    public void calculer(ActionEvent actionEvent) {
        int n = Integer.valueOf(saisieN.getText()) ;
        int dblN = 2*n;
        repN.setText(String.valueOf(dblN));
    }
}
