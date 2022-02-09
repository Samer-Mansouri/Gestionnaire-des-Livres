package mvc.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Window;
import mvc.Controllers.CRUDLivres.CRUDL;
import mvc.FxmlLoader;

public class LoginController {

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    public void seConnecter(ActionEvent event) {

        Window owner = mainAnchorPane.getScene().getWindow();
        System.out.println();

        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Erreur !", "Veuillez remplir tout le formulaire de connexion");
        } else {
            int connection = CRUDL.seConnecter(username.getText(), password.getText());
            if (connection == 1) {
                FxmlLoader object = new FxmlLoader();
                Pane view = object.getPage("Main");
                mainAnchorPane.getChildren().setAll(view);
            } else if (connection == 2) {
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Erreur !", "Nom d'utilisateur ou Mot de passe incorrect");
            } else if (connection == 0) {
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Échec !", "Échec de la connexion");
            }
        }
    }

}

