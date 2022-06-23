/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.Date;
import ec.edu.espol.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Alert;
/**
 *
 * @author Kevin Castro,Richard Perez
 */
public class Imagen {
    private String url;
    private String descripcion;
    private String lugar;
    private Date fecha;
    private String album;
    private CircularDoubleLinkedList<Persona> personas;

    public Imagen(String nImagen, String descripcion, String lugar, Date fecha, String album, CircularDoubleLinkedList personas) {
        this.url = nImagen;
        this.descripcion = descripcion;
        this.lugar = lugar.toUpperCase();
        this.fecha = fecha;
        this.album = album.toUpperCase();
        this.personas = personas;
    }
    

    public String getnImagen() {
        return url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAlbum() {
        return album;
    }

    public CircularDoubleLinkedList getPersonas() {
        return personas;
    }

    public void setnImagen(String nImagen) {
        this.url = nImagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAlbum(String album) {
        this.album = album.toUpperCase();
    }

    public void setPersonas(CircularDoubleLinkedList personas) {
        this.personas = personas;
    }
    
    public void saveFile(String nomfile){
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(nomfile, true))){
            bf.write(this.album + "|" + this.url + "|" + this.lugar + "|" + this.fecha + "|" + this.personas);
            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Foto agregada con éxito");
            a.show();
        }
        catch(IOException ex){
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible agregarla");
            a.show();
        }
    }
    
}
