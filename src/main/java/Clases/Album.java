/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kevin Castro,Richard Perez
 * @param <E>
 */
public class Album <E> {
    private String nombre;
    private CircularDoubleLinkedList imagenes; 

    public Album(String nombre, CircularDoubleLinkedList imagenes) {
        this.nombre = nombre;
        this.imagenes = imagenes;
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
    
}
