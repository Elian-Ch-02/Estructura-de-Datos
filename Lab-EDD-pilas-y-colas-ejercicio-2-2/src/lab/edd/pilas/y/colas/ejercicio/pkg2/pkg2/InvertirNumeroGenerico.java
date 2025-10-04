/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.edd.pilas.y.colas.ejercicio.pkg2.pkg2;

/**
 *
 * @author Elian
 */
public class InvertirNumeroGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int numero = 5678;
        pila<Integer> pila = new pila<>();

        // Descomponer el número
        int temp = numero;
        while (temp > 0) {
            pila.push(temp % 10);
            temp /= 10;
        }

        // Reconstruir
        int invertido = 0;
        int factor = 1;
        while (!pila.estaVacia()) {
            invertido += pila.pop() * factor;
            factor *= 10;
        }

        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: " + invertido);
    }
    
}
