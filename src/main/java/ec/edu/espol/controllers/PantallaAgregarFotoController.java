/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import ec.edu.espol.proyectoed_pp.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaAgregarFotoController implements Initializable {

    @FXML
    private Button btnSiguiente;
    @FXML
    private Button btnRegresar;
    @FXML
    private TextField infoAlbum;
    @FXML
    private TextField infoLugar;
    @FXML
    private TextField infoDia;
    @FXML
    private TextField infoMes;
    @FXML
    private TextField infoAn;
    @FXML
    private TextField infoDesc;
    @FXML
    private TextField infoMarcaCam;
    @FXML
    private TextField infoModeloCam;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void siguientesDatos(MouseEvent event) {
        try{
            Stage stg = (Stage)btnSiguiente.getScene().getWindow();
            FXMLLoader loader = App.loadFXML("pantallaAgregarFotoSiguiente");
            Scene sc = new Scene(loader.load(), 600, 400);
            stg.setScene(sc);
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible avanzar");
            a.show();
        }
    }

    @FXML
    private void regresarPrincipal(MouseEvent event) {
        try{
            Stage stg = (Stage)btnRegresar.getScene().getWindow();
            stg.close();
            FXMLLoader loader = App.loadFXML("pantallaInicial");
            Scene sc = new Scene(loader.load(), 600, 400);
            Stage sg = new Stage();
            sg.setScene(sc);
            sg.show();
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible regresar a la ventana principal");
            a.show();
        }
    }


    
}
