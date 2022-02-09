package mvc.Controllers;

import com.gembox.spreadsheet.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import mvc.Controllers.CRUDLivres.CRUDL;
import mvc.Models.Livre;

import java.io.File;
import java.io.IOException;

public class ImporterExcelController {
    @FXML
    private Button boutonImporter;

    static {
        SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
    }

    public void importerFichierExcel(ActionEvent event) throws IOException {

        Window owner = boutonImporter.getScene().getWindow();


        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choisir un fichier Excel");
        File file = fileChooser.showOpenDialog(boutonImporter.getScene().getWindow());
        if(file != null){
            String fileName = file.toString();
            int index = fileName.lastIndexOf('.');
            String extension = "";
            if(index > 0) {
                extension = fileName.substring(index + 1);
            }
            if(extension.equals("xlsx")){
                ExcelFile workbook = ExcelFile.load(file.getAbsolutePath());
                ExcelWorksheet worksheet = workbook.getWorksheet(0);
                String[][] sourceData = new String[101][3];
                System.out.println(worksheet.getDefaultRowHeight());

                int rowsNumber = 0;
                for (int row = 0; row < sourceData.length; row++) {


                    for (int column = 0; column < sourceData[row].length; column++) {
                        ExcelCell cell = worksheet.getCell(row, column);
                        if (cell.getValueType() != CellValueType.NULL){
                            sourceData[row][column] = cell.getValue().toString();
                            System.out.println(cell.getValue().toString() + " " + row + " " + column);
                        }

                    }
                    rowsNumber+=1;
                }

                if(rowsNumber > 101){
                    AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Échec !", "Le nombre de lignes permis a été dépassé");
                } else {
                    if (!sourceData[0][0].equals("titre") || !sourceData[0][1].equals("auteur") || !sourceData[0][2].equals("disponnible")) {
                        AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Échec !", "L'entête de fichier n'est pas valide");
                    } else {

                        for(int i=1; i< sourceData.length; i++){
                            if(sourceData[i][0]!=null && sourceData[i][1]!=null && sourceData[i][2]!=null){
                                CRUDL.createLivre(new Livre(sourceData[i][0], sourceData[i][1], sourceData[i][2].equals("true")));
                            } else {
                                break;
                            }
                        }
                        AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Succéss !", "Le fichier a été importé avec succés");
                    }

                }

            } else {
                System.out.print("Wrong file Extension " + extension);
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Erreur !", "Le fichier importer n'est pas de type Excel");
            }
        }


    }


}
