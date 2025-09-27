/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labcolas;

/**
 *
 * @author UCC
 */
public interface IQueue {
    void enqueue(int elemntos);     //Insertar un elemto al final de la cola
    int dequeue();                  //Eliminar y devuelve el primer elemonto
    int front();                    //Devuelve el primer elemento sin eliminarlo
    boolean isEmpty();              //verifica si la cola esta vacia 
    boolean isFull();               //verifica si la cola esta llena 
    int size();                     //Retorna el numero de elemento
}
