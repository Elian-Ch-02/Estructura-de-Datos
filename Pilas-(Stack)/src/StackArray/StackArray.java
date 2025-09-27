/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackArray;
import java.util.Arrays;

import pilas.stack.IStack;

/**
 *
 * @author UCC
 */
public class StackArray  implements IStack {
    
    private int [] elementos;
    private int tope;
    private int capacidad;
    
    //contructor de la clase
    
    public StackArray(int capacidad){
        this.capacidad = capacidad;
        elementos = new int[capacidad];
        tope = -1;
    }

    //
    
    @Override
    public void push(int elemento) {
        if(tope == capacidad -1){
            System.out.println("Error: la pila esta llena");
        }else{
            elementos[++tope] = elemento;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()){
            System.out.println("Error: la pila esta vacia");
            return-1;
        }
        return elementos[tope--];
    }

    @Override
    public int peek() {
      if (isEmpty()){
            System.out.println("La pila esta vacia");
            return-1;
        }
        return elementos[tope];
    }

    @Override
    public boolean isEmpty() {
       return tope == -1;
    }

    @Override
    public void prints() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(elementos, 0, tope)));
    }

    @Override
    public int size() {
        return tope +1;
    }
    
}
