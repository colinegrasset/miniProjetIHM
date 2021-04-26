package AppEtudiant;

import java.io.IOException;

import AppEtudiant.model.Etudiant;
import javafx.application.Application;
import java.util.List;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainAppEtudiant extends Application {

    private Stage primaryStage;
    private BorderPane principalePage;

    private ObservableList<AppEtudiant.model.Etudiant> donneesEtudiant = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainAppEtudiant() {
        // Ajout de quelques données
        donneesEtudiant.add(new Etudiant("VIDAL", "Océane", 2000, "L3", null));
        donneesEtudiant.add(new Etudiant("BOUHIER", "Noé", 1999, "L3", null));
        donneesEtudiant.add(new Etudiant("LECLERE", "Amandine", 1999, "M1", "physio"));
    }

    public ObservableList<Etudiant> getPersonData() {
        return donneesEtudiant;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AppEtudiant");

        initPrincipalePage();

        showListeEtudiant();
    }

    /**
     * Initializes the root layout.
     */
    public void initPrincipalePage() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainAppEtudiant.class.getResource("view/PrincipalePage.fxml"));
            principalePage = (BorderPane) loader.load();

            Scene scene = new Scene(principalePage);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showListeEtudiant() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainAppEtudiant.class.getResource("view/ListeEtudiant.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            principalePage.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
