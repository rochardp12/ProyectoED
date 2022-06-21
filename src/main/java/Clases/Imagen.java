/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

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
    private CircularDoubleLinkedList personas;

    public Imagen(String nImagen, String descripcion, String lugar, Date fecha, String album, CircularDoubleLinkedList personas) {
        this.url = nImagen;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.album = album;
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
        this.album = album;
    }

    public void setPersonas(CircularDoubleLinkedList personas) {
        this.personas = personas;
    }
    
}
