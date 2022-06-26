/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.controllers;

import ec.edu.espol.model.Album;
import ec.edu.espol.proyectoed_pp.App;
import ec.edu.espol.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
        hboxAlbumes.getChildren().clear();
        ArrayList<Album> albumes = Album.readFromFile("albumes.txt");
        for(Album album: albumes){
            VBox vboxAlbumes = new VBox();
            Label lbl = new Label();
            Image img = new Image("img/carpeta.jpg");
            ImageView imgview = new ImageView(img); //falta poner opcion de acceder al album al darle click a la imagen
            imgview.setFitHeight(20);
            imgview.setFitWidth(30);
            lbl.setText(album.getNombre());
            vboxAlbumes.getChildren().add(lbl);
            vboxAlbumes.getChildren().add(imgview);
            vboxAlbumes.setSpacing(10);
            hboxAlbumes.getChildren().add(vboxAlbumes);
        }
    }    

    @FXML
    private void crearAlbum(MouseEvent event) {
        try{
            Stage stg = (Stage)btnNuevoAlbum.getScene().getWindow();
            stg.close();
            FXMLLoader loader = App.loadFXML("pantallaCrearAlbum");
            Scene sc = new Scene(loader.load(), 600, 400);
            Stage sg = new Stage();
            sg.setScene(sc);
            sg.show();
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible crear album");
            a.show();
        }
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
