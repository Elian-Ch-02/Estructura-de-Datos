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
        
        Data superman = new Data("Clark Kent", "Super Fuersa", "superman",35);
        Data batman = new Data("Bruca Wayne", "Inteligencia", "Batman",40);
        Data Wonderwoman = new Data("Diana Prince","Super Fuerza","Mujer maravilla",30);
        Data flash = new Data("Barry Allen","Super Velocidad","Flash",25);
        
        lista.agregarAlInicio(flash);
        
        lista.agregarAlFinal(batman);
        
        lista.agregarAntesDe(batman,Clark Kent);
        
        lista.agregarDespuesde(Flash,Diana Prince);
        
        lista.imprimirLista();
    }
    
}
