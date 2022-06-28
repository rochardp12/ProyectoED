/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import ec.edu.espol.model.Album;
import ec.edu.espol.model.ContraException;
import ec.edu.espol.model.NombreUsuarioException;
import ec.edu.espol.model.PanelVacioException;
import ec.edu.espol.model.Usuario;
import ec.edu.espol.proyectoed_pp.App;
import ec.edu.espol.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Richard
 */
public class PantallaIniciarSesionController implements Initializable {

    @FXML
    private TextField infoUsuario;
    @FXML
    private Button btnIniciar;
    @FXML
    private TextField infoContra;
    @FXML
    private Button btnRegistrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void iniciarSesion(MouseEvent event) {
        ArrayList<Usuario> usuarios = Usuario.readFromFile("usuarios.txt");
        try{
            if(Objects.equals(infoUsuario.getText(),"") || Objects.equals(infoContra.getText(),""))
                throw new PanelVacioException("Llenar todos los datos por favor");
            for(Usuario usuario: usuarios){
                if(!(Usuario.verificarNombreUsuario(infoUsuario.getText())))
                    throw new NombreUsuarioException("Usuario no registrado. Registrar primero por favor");
            }
            if(!(Usuario.verificarContra(infoContra.getText())))
                throw new ContraException("Contraseña incorrecta");
        }
        catch(PanelVacioException | NombreUsuarioException | ContraException ex){
            Alert a = new Alert(AlertType.ERROR, ex.getMessage());
            a.show();
        }
    }

    @FXML
    private void registrarUsuario(MouseEvent event) {
        try{
            Stage stg = (Stage)btnRegistrar.getScene().getWindow();
            stg.close();
            FXMLLoader loader = App.loadFXML("pantallaRegistros");
            Scene sc = new Scene(loader.load(), 640, 480);
            Stage sg = new Stage();
            sg.setScene(sc);
            sg.show();
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible registrar nuevo usuario");
            a.show();
        }
    }
    
}
