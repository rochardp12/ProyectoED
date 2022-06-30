/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import java.util.Iterator;

/**
 *
 * @author Kevin Castro,Richard Perez
 * @param <E>
 */
public class CircularDoubleLinkedList <E> implements List<E>,Iterable<E> {
    private Node<E> last;
    private int tam;
    
    public CircularDoubleLinkedList(){
        last=null;
        tam=0;
    }
    
     private class Node<E>{
        private E contenido;
        private Node<E> siguiente;
        private Node<E> anterior;
        
        public Node(E e){
            this.contenido=contenido;
            this.siguiente=null;
            this.anterior=null;
        }
    }
    
    public Node <E> getNode(int index){
        if(index==0){
            return last.siguiente;
        }
        if (index==tam-1){
            return last;
        }
        Node <E> n;
        if(index<tam/2){
            n=last.siguiente;
            for(int i=0;i<index;i++){
                n=n.siguiente;
            }
        }else{
            n=last;
            for(int i=tam-1;i>index;i--){
                n=n.anterior;
            }  
        }
        return n;
    }
    
    

    @Override
    public boolean addFirst(E e) {
       if(e==null){ 
        return false;
        }
        Node<E> n = new Node(e);
        if(isEmpty()) {
            last = n; 
            last.siguiente=n;
        }
        else{
            Node<E> segundo = last.siguiente;
            last.siguiente = n;
            n.siguiente = segundo;
            segundo.anterior=n;
            n.anterior= last;
        }
        tam ++;
        return true;
       
    }
    

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>(){
            Node<E> n = last.siguiente;
            @Override
            public boolean hasNext() {
                return n!=null;
            }

            @Override
            public E next() {
                E temp = n.contenido;
                n = n.siguiente;
                return temp;
            }
            
        };
        return it;
    }
    
   

    @Override
    public boolean addLast(E e) {
       if(e==null){ 
        return false;
        }
        Node<E> n = new Node(e);
        if(isEmpty()){
           last =n; 
           last.siguiente = n;
        }
        else{
            n.anterior = last;
            Node<E> primero = last.siguiente;
            n.siguiente=primero;
            primero.anterior = n;
            last.siguiente = n;
            last = n;
        }
        tam++;
        return true;
    }

    @Override
    public E getFirst() {
        if (isEmpty()){
            return null;
        }
        return last.siguiente.contenido;
    }

    @Override
    public E getLast() {
        if (isEmpty()){
            return null;
        }
        return last.contenido;
    }

    @Override
    public int indexOf(E e) {
        if (e==null){
            return -1;
        }
        if (isEmpty()){
            return -1;
        }
        Node <E> n=last.siguiente;
        for(int i=0;i<tam;i++){
            if(n.contenido.equals(e)){
                return i;
            }
            n=n.siguiente;
        }
        return -1;
    }

    @Override
    public int size() {
        return tam;
    }

    @Override
    public boolean removeLast() {
        if (isEmpty()){
            return false;
        }
        last.contenido=null;
        if(tam==1){
            last=null;
        }else{
            Node <E> n=last.anterior;
            Node <E> primero=last.siguiente;
            n.siguiente=primero;
            primero.anterior=n;
            last.siguiente=last.anterior=null;
            last=n;
        }
        tam--;
        return true;
    }

    @Override
    public boolean removeFirst() {
        if (isEmpty()){
            return false;
        }
        if (tam==1){
            last.contenido=null;
            last=last.siguiente=last.anterior=null;
        }else{
            Node <E> eliminar=last.siguiente;
            Node <E> nuevoPrimero=eliminar.siguiente;
            last.siguiente=nuevoPrimero;
            nuevoPrimero.anterior=last;
            eliminar.contenido=null;
            eliminar.siguiente=eliminar.anterior=null;
        }
        tam--;
        return true;
    }

    @Override
    public boolean insert(int index, E e) {
        if(e==null){
            return false;
        }
        if(index>tam-1 || index<0){
            System.out.println("Indice no valido");
        }
        if (index==0){
            addFirst(e);
            return true;            
        }
        Node <E> n=new Node(e);
        Node <E> n1=getNode(index);
        Node <E> ante=n1.anterior;
        ante.siguiente=n1.anterior=n;
        n.anterior=ante;
        n.siguiente=n1;
        tam++;
        return true;        
    }

    @Override
    public boolean set(int index, E e) {
        if(e==null){
            return false;
        }
        if(index>tam-1 || index<0){
            System.out.println("Indice no valido");
        }
        if(index==0){
            last.siguiente.contenido=e;
        }
        if(index==tam-1){
            last.contenido=e;
        }
        Node <E> n=getNode(index);
        n.contenido=e;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return tam==0;
    }

    @Override
    public E get(int index) {
        if(index>tam-1 || index<0){
            System.out.println("Indice no valido");
        }
        if(isEmpty()){
            return null;
        }
        if(index==0){
            return last.siguiente.contenido;
        }
        if(index==tam-1){
            return last.contenido;
        }
        Node <E> n=getNode(index);
        return n.contenido;
    }

    @Override
    public boolean contains(E e) {
        if(e==null){
            return false;
        }
        Node <E> n=last.siguiente;
        for(int i=0;i<tam;i++){
            if (n.contenido.equals(e)){
                return true;
            }
            n=n.siguiente;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        if(index>tam-1 || index<0){
            System.out.println("Indice no valido");
        }
        if(index==0){
            return removeFirst();
        }
        if(index==tam-1){
            return removeLast();
        }
        Node <E> n=getNode(index-1);
        Node <E> remove=n.siguiente;
        Node <E> n1=remove.siguiente;
        remove.contenido=null;
        remove.siguiente=remove.anterior=null;
        n.siguiente=n1;
        n1.anterior=n;
        tam--;
        return true;        
    }
    
}
