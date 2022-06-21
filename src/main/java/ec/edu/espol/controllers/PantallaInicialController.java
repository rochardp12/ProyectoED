/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaInicialController implements Initializable {

    @FXML
    private Button btnNuevoAlbum;
    @FXML
    private Button btnEliminarAlbum;
    @FXML
    private Button btnAgregarFoto;
    @FXML
    private Button btnBuscar;
    @FXML
    private ScrollPane panelAlbumes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void crearAlbum(MouseEvent event) {
    }

    @FXML
    private void eliminarAlbum(MouseEvent event) {
    }

    @FXML
    private void agregarFoto(MouseEvent event) {
    }

    @FXML
    private void buscar(MouseEvent event) {
    }
    
}
