/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import ec.edu.espol.model.Album;
import ec.edu.espol.util.CircularDoubleLinkedList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

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
    private HBox hboxAlbumes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CircularDoubleLinkedList albumes = Album.readFromFile("albumes.txt");
        
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
