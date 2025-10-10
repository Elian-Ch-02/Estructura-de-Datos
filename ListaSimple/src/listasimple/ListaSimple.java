/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimple;

/**
 *
 * @author UCC
 */
public class ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         ListaS lista = new ListaS();
    
    // ORDEN CORRECTO: power, name, alias, age
    Data superman = new Data( "Clark Kent","Super Fuerza", "Superman", 35);
    Data batman = new Data( "Bruce Wayne","Inteligencia", "Batman", 40);
    Data wonderwoman = new Data( "Diana Prince","Super Fuerza", "Mujer Maravilla", 30);
    Data flash = new Data( "Barry Allen","Super Velocidad", "Flash", 25);
    
    lista.agregarAlInicio(flash);
    lista.agregarAlFinal(batman);
    
    
    // Ahora prueba insertar
    lista.insertarAntesde(wonderwoman, "Bruce Wayne");
    lista.insertarDespuesde(superman, "Barry Allen");
    
    System.out.println("Lista completa:");
    lista.imprimirLista();
    
    System.out.println("\nTamaño: " + lista.getSize());
    }
    
}
