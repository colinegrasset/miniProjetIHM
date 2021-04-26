package AppEtudiant.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import AppEtudiant.MainAppEtudiant;
import AppEtudiant.model.Etudiant;

public class ListeEtudiantController {
    @FXML
    private TableView<Etudiant> tableEtudiant;
    @FXML
    private TableColumn<Etudiant, String> nomColumn;
    @FXML
    private TableColumn<Etudiant, String> prenomColumn;

    @FXML
    private Label nomLabel;
    @FXML
    private Label prenomLabel;
    @FXML
    private Label anneeNaissanceLabel;
    @FXML
    private Label promotionLabel;
    @FXML
    private Label optionLabel;

    private MainAppEtudiant mainApp;

    public ListeEtudiantController() {
    }

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        nomColumn.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        prenomColumn.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
    }

    public void setMainApp(MainAppEtudiant mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        tableEtudiant.setItems(mainApp.getPersonData());
    }
}
