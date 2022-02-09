package mvc.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import mvc.Controllers.CRUDLivres.CRUDL;
import mvc.Models.Livre;


public class AjouterLivreController {

    @FXML
    private TextField titre;

    @FXML
    private TextField auteur;

    @FXML
    private ComboBox dispo;

    @FXML
    private Button boutonAjouter;

    @FXML
    public void ajouterLivre(ActionEvent event){

        Window owner = boutonAjouter.getScene().getWindow();
        if(titre.getText().isEmpty() && auteur.getText().isEmpty()){
            AlertHelper.showAlert(Alert.AlertType.WARNING, owner, "Erreur !", "Veuillez remplir le fomulaire!");
        } else if(titre.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, owner, "Erreur !", "Le champ titre est obligatoire!");
        } else if(auteur.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, owner, "Erreur !", "Le champ auteur est obligatoire!");
        } else {

            if(CRUDL.createLivre(new Livre(titre.getText(), auteur.getText(), dispo.getValue().toString().equals("Oui"))) == 1){
                AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Succéss !", "Le livre a été ajouté avec succés!");
                titre.setText("");
                auteur.setText("");
            } else {
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Échec !", "Le livre séléctionnée n'a pas été mis à jour avec succés!");
            }
        }


    }
}


