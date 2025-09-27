/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas.stack;

import StackArray.StackArray;

/**
 *
 * @author UCC
 */
public class labPilas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear una pila con capacidad inicial de 5
        IStack stack = new StackArray(5);
        
        // agregar elementos a la pila 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        //Insertar agregar otro elemnto paraver el rendimiento 
        stack.push(60);  // La pila se redimencionara y agregara el valor
        
        //mostrar los elementos de la pila 
        System.out.println("Elemntos en la pila : ");
        stack.prints();
        
        //mostrar el elemneto superior de la pila sin eliminarlo
        System.out.println("El elemnto superior de la pila es  " + stack.peek());
        
        // Eliminar el ultimo elemnto de la pila
        stack.pop();
        System.out.println("Elemtos en la pila despues de pop ; ");
        stack.prints();
        
        
    }
    
}
