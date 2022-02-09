package mvc;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {

    private Pane view;

    public Pane getPage(String fileName){
        try {
            URL fileUrl = App.class.getResource( fileName + ".fxml");
            if(fileUrl == null){
                throw new java.io.FileNotFoundException("FXML File not found");
            }

            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e){
            System.out.println("No page " + fileName + " please check FxmlLoader");
        }

        return view;
    }
}
