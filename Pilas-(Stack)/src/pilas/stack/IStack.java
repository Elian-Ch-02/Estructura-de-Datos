/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pilas.stack;

/**
 *
 * @author UCC
 */
public interface IStack {
    
    void push(int elemento);   //insertar un elemento
    int pop();                 // Eliminar y devolver el elemnto del tope
    int peek();                // Ver el elemento del tope sin eliminar
    boolean isEmpty();         // verificar si esta vacia 
    void prints();             // Impime todos los elementos 
    int size();                // Numero de elementos 
    
}
