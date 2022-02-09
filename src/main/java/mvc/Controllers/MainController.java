package mvc.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import mvc.FxmlLoader;

public class MainController {


    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private BorderPane mainPane;

    @FXML
    private void handleListeLivresAction(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("LivresTables");
        mainPane.setCenter(view);

    }

    @FXML
    private void handleAjouterLivreAction(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("AjouterLivre");
        mainPane.setCenter(view);
    }

    @FXML
    private void handleImporterExcel(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("ImporterExcel");
        mainPane.setCenter(view);
    }

    @FXML
    private void seDeconnecter(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("Login");
        mainAnchorPane.getChildren().setAll(view);
    }


}
