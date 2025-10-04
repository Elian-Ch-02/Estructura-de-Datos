/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.edd.pilas.y.colas.ejercicio.pkg2;

/**
 *
 * @author Elian
 */
public class pila<T> {
    private java.util.LinkedList<T> elementos = new java.util.LinkedList<>();

    // push
    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    // pop
    public T pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos.removeFirst();
    }

    // peek
    public T peek() {
        return elementos.getFirst();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
