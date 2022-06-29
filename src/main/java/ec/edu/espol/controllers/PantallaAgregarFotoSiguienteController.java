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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaAgregarFotoSiguienteController implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnAnterior;
    @FXML
    private Button btnKeywords;
    @FXML
    private Button btnPersonas;
    @FXML
    private Button btnFoto;
    private String nombre;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void agregarFoto(MouseEvent event) {
    }

    @FXML
    private void regresarAnterior(MouseEvent event) {
        try{
            Stage stg = (Stage)btnAnterior.getScene().getWindow();
            FXMLLoader loader = App.loadFXML("pantallaAgregarFoto");
            Scene sc = new Scene(loader.load(), 640, 480);
            PantallaAgregarFotoController pac = loader.getController();
            pac.recibirUsuario(this.nombre);
            stg.setScene(sc);
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible regresar");
            a.show();
        }
    }

    @FXML
    private void agregarKeywords(MouseEvent event) {
    }

    @FXML
    private void agregarPersonas(MouseEvent event) {
    }

    @FXML
    private void buscarFoto(MouseEvent event) {
    }
    
    public void recibirUsuario(String nombre){
        this.nombre = nombre;
    }
}
