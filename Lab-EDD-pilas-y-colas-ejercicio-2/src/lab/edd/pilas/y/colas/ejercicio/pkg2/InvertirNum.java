/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.edd.pilas.y.colas.ejercicio.pkg2;

import java.util.Stack;

/**
 *
 * @author Elian
 */
public class InvertirNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int numero = 1234;
        Stack<Integer> pila = new Stack<>();
        
        
        

        // Paso 1: Descomponer el número en dígitos y meterlos a la pila
        int temp = numero;
        while (temp > 0) {
            pila.push(temp % 10);
            temp /= 10;
        }
      
        // Paso 2: Reconstruir el número en orden invertido
        int invertido = 0;
        int factor = 1;
        while (!pila.isEmpty()) {
            invertido += pila.pop() * factor;
            factor *= 10;
        }

        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: " + invertido);
        
       
        
        
        Stack<String> historial = new Stack<>();
         
        // Estado inicial vacío
        String texto = "";
        historial.push(texto);

        // Simulamos escribir
        texto = texto + "Hola";
        historial.push(texto);

        texto = texto + " mundo";
        historial.push(texto);

        texto = texto + "!";
        historial.push(texto);

        System.out.println("Texto actual: " + texto);

        // Simulamos Ctrl + Z
        texto = historial.pop(); // estado actual
        texto = historial.pop(); // deshacer último
        System.out.println("Después de Ctrl+Z: " + texto);

        // Otro Ctrl+Z
        texto = historial.pop();
        System.out.println("Después de otro Ctrl+Z: " + texto);
        
       
    }
    }
    

