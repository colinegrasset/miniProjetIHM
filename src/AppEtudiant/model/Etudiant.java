package AppEtudiant.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Etudiant {

    private StringProperty nom;
    private StringProperty prenom;
    private IntegerProperty anneeNaissance;
    private StringProperty promotion;
    private StringProperty option;


    /**
     * Constructor with some initial data.
     *
     * @param nom
     * @param prenom
     * @param anneeNaissance
     * @param promotion
     * @param option
     */
    public Etudiant(String nom, String prenom, Integer anneeNaissance, String promotion, String option) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.anneeNaissance = new SimpleIntegerProperty(anneeNaissance);
        this.promotion = new SimpleStringProperty(promotion);
        this.option = new SimpleStringProperty(option);
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public int getAnneeNaissance() {
        return anneeNaissance.get();
    }

    public IntegerProperty anneeNaissanceProperty() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance.set(anneeNaissance);
    }

    public String getPromotion() {
        return promotion.get();
    }

    public StringProperty promotionProperty() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion.set(promotion);
    }

    public String getOption() {
        return option.get();
    }

    public StringProperty optionProperty() {
        return option;
    }

    public void setOption(String option) {
        this.option.set(option);
    }
}
