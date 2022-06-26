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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaAnadirPersonasController implements Initializable {

    @FXML
    private Button btnContinuar;
    @FXML
    private Button btnReiniciar;
    @FXML
    private Button btnRegresar;
    @FXML
    private TextField infoCantidad;
    @FXML
    private Button btnCantidad;
    @FXML
    private Text lblPersonas;
    @FXML
    private TextField infoPersonas;
    @FXML
    private Button btnAnadir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void enviarInfo(MouseEvent event) {
    }

    @FXML
    private void reiniciarInfo(MouseEvent event) {
    }

    @FXML
    private void regresarAnterior(MouseEvent event) {
    }

    @FXML
    private void verificarCantidad(MouseEvent event) {
    }

    @FXML
    private void anadirPersona(MouseEvent event) {
    }
    
}
