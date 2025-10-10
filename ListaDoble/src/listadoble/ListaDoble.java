/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

/**
 *
 * @author Elian
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaD lista = new ListaD();
    
        // Crear datos de superhéroes
        Data superman = new Data("Clark Kent", "Super Fuerza", "Superman", 35);
        Data batman = new Data("Bruce Wayne", "Inteligencia", "Batman", 40);
        Data wonderwoman = new Data("Diana Prince", "Super Fuerza", "Mujer Maravilla", 30);
        Data flash = new Data("Barry Allen", "Super Velocidad", "Flash", 25);
        Data aquaman = new Data("Arthur Curry", "Comunicación Acuática", "Aquaman", 38);
        
        // Probar agregar al inicio y al final
        System.out.println("=== Agregando elementos ===");
        lista.agregarAlInicio(flash);
        lista.agregarAlFinal(batman);
        
        System.out.println("\nLista después de agregar Flash (inicio) y Batman (final):");
        lista.imprimirLista();
        
        // Probar insertar antes y después
        System.out.println("\n=== Insertando elementos ===");
        lista.insertarAntesde(wonderwoman, "Bruce Wayne");
        lista.insertarDespuesde(superman, "Barry Allen");
        
        System.out.println("\nLista después de insertar Wonder Woman (antes de Batman) y Superman (después de Flash):");
        lista.imprimirLista();
        
        // Agregar un elemento más
        lista.agregarAlFinal(aquaman);
        System.out.println("\nLista después de agregar Aquaman al final:");
        lista.imprimirLista();
        
        // Probar impresión inversa (característica de lista doble)
        System.out.println();
        lista.imprimirListaInversa();
        
        // Probar búsqueda
        System.out.println("\n=== Buscando elementos ===");
        Data encontrado = lista.buscarElemento("Diana Prince");
        if(encontrado != null){
            System.out.println("Elemento encontrado: " + encontrado);
        }
        
        // Probar eliminación
        System.out.println("\n=== Eliminando elementos ===");
        boolean eliminado = lista.eliminarElemento("Clark Kent");
        System.out.println("Superman eliminado: " + eliminado);
        
        System.out.println("\nLista después de eliminar a Superman:");
        lista.imprimirLista();
        
        // Mostrar tamaño
        System.out.println("\n=== Información de la lista ===");
        System.out.println("Tamaño: " + lista.getSize());
        System.out.println("Primer elemento: " + lista.obtenerPrimero());
        System.out.println("Último elemento: " + lista.obtenerUltimo());
        
        // Demostrar recorrido inverso nuevamente
        System.out.println();
        lista.imprimirListaInversa();
   
        
    }
    
}
