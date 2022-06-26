/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaFotosController implements Initializable {

    @FXML
    private Text nombreAlbum;
    @FXML
    private Button btnComentarios;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnRegresar;
    @FXML
    private Button btnAnteriorFoto;
    @FXML
    private Button btnSiguienteFoto;
    @FXML
    private Button btnDetalles;
    @FXML
    private ComboBox<?> cboxReacciones;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accederComentarios(MouseEvent event) {
    }

    @FXML
    private void eliminarFoto(MouseEvent event) {
    }

    @FXML
    private void regresarPrincipal(MouseEvent event) {
    }

    @FXML
    private void anteriorFoto(MouseEvent event) {
    }

    @FXML
    private void siguienteFoto(MouseEvent event) {
    }

    @FXML
    private void accederDetalles(MouseEvent event) {
    }

    @FXML
    private void seleccionarReaccion(ActionEvent event) {
    }
    
}
