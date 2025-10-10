/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Elian
 */
public class Nodo {
    Data data;
    Nodo next;  // Puntero al nodo siguiente
    Nodo prev;  // Puntero al nodo anterior (NUEVO)
 
    
    // Constructor con solo dato
    public Nodo(Data dato){
        this.data = dato;
        this.next = null;
        this.prev = null;  // Inicializar prev
    }
    
    // Constructor con dato y siguiente nodo
    public Nodo(Data dato, Nodo siguiente){
        this.data = dato;
        this.next = siguiente;
        this.prev = null;
    }
    // Constructor completo con dato, siguiente y anterior
    public Nodo(Data dato, Nodo siguiente, Nodo anterior){
        this.data = dato;
        this.next = siguiente;
        this.prev = anterior;
    }

    // Getters y Setters
    public Data getData() {
        return data;
    }
    
    public void setData(Data data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    // Nuevo Métodos para el puntero anterior
    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
    
}
