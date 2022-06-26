/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import ec.edu.espol.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 *
 * @author Kevin Castro,Richard Perez
 * @param <E>
 */
public class Album <E> {
    private String nombre;
    private CircularDoubleLinkedList<Imagen> imagenes; 
    private String desc;

    public Album(String nombre, String desc) {
        this.nombre = nombre.toUpperCase();
        this.imagenes = new CircularDoubleLinkedList<>();
        this.desc = desc.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setImagenes(CircularDoubleLinkedList imagenes) {
        this.imagenes = imagenes;
    }

    public CircularDoubleLinkedList getImagenes() {
        return imagenes;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public static void crearAlbum(String nombre, String desc){
        Album album = new Album(nombre,desc);
        album.saveFile("albumes.txt");
    }
    
    public void saveFile(String nomfile){
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(nomfile, true))){
            bf.write(this.nombre + this.desc + "\n");
            Alert a = new Alert(AlertType.CONFIRMATION, "Álbum agregado con éxito");
            a.show();
        }
        catch(IOException ex){
            Alert a = new Alert(AlertType.ERROR, "No es posible agregarlo");
            a.show();
        }
    }
    
    public static ArrayList<Album> readFromFile(String nomfile){
        ArrayList<Album> albumes = new ArrayList<>(0);
        try(BufferedReader bf = new BufferedReader(new FileReader(nomfile))){
            String linea;
            while((linea = bf.readLine()) != null){
                String[] arreglo = linea.split("\\|");
                Album album = new Album(arreglo[0],arreglo[1]);
                albumes.addLast(album);
            }
        }
        catch(IOException ex){
            Alert a = new Alert(AlertType.ERROR, "No es posible obtener los albumes");
            a.show();
        }
        return albumes;
    }
}
