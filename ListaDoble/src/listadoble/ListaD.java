/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Elian
 */
public class ListaD {
    private Nodo head;  // Primer nodo de la lista 
    private Nodo tail;  // Último nodo de la lista (NUEVO)
    private int size;   // Tamaño de la lista
    
    public ListaD(){
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Agregar un elemento al inicio de la lista
     */
    public void agregarAlInicio(Data dato){
        Nodo nuevoNodo = new Nodo(dato);
        
        if(head == null){
            // Lista vacía: el nuevo nodo es tanto head como tail
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            // Conectar el nuevo nodo con el head actual
            nuevoNodo.setNext(head);
            head.setPrev(nuevoNodo);
            head = nuevoNodo;
        }
        size++;
    }
    
    /**
     * Agregar un elemento al final de la lista
     */
    public void agregarAlFinal(Data dato){
        Nodo nuevoNodo = new Nodo(dato);
        
        if(head == null){
            // Lista vacía
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            // Conectar con el último nodo (tail)
            tail.setNext(nuevoNodo);
            nuevoNodo.setPrev(tail);
            tail = nuevoNodo;
        }
        size++;
    }
    
    /**
     * Insertar un elemento antes de un nodo específico
     */
    public boolean insertarAntesde(Data dato, String nombre){
        if (head == null){
            return false;
        }
        
        // Caso especial: insertar antes del head
        if (head.getData().getName().equals(nombre)){
            agregarAlInicio(dato);
            return true;
        }
        
        // Buscar el nodo
        Nodo actual = head;
        while (actual != null && !actual.getData().getName().equals(nombre)) {
            actual = actual.getNext();
        }
        
        if (actual != null){
            Nodo nuevoNodo = new Nodo(dato);
            Nodo anterior = actual.getPrev();
            
            // Conectar el nuevo nodo
            nuevoNodo.setNext(actual);
            nuevoNodo.setPrev(anterior);
            
            // Actualizar referencias de nodos adyacentes
            anterior.setNext(nuevoNodo);
            actual.setPrev(nuevoNodo);
            
            size++;
            return true;
        }
        
        return false;
    }
    
    /**
     * Insertar un elemento después de un nodo específico
     */
    public boolean insertarDespuesde(Data dato, String nombreB){
        Nodo actual = head;
        
        while(actual != null){
            if(actual.getData().getName().equals(nombreB)){
                Nodo nuevoNodo = new Nodo(dato);
                Nodo siguiente = actual.getNext();
                
                // Conectar el nuevo nodo
                nuevoNodo.setPrev(actual);
                nuevoNodo.setNext(siguiente);
                
                actual.setNext(nuevoNodo);
                
                // Si hay un nodo siguiente, actualizar su prev
                if(siguiente != null){
                    siguiente.setPrev(nuevoNodo);
                } else {
                    // Si no hay siguiente, el nuevo nodo es el tail
                    tail = nuevoNodo;
                }
                
                size++;
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }
    
    /**
     * Eliminar un elemento de la lista
     */
    public boolean eliminarElemento(String nombreB){
        if(head == null){
            return false; 
        }
        
        // Caso especial: eliminar el head
        if(head.getData().getName().equals(nombreB)){
            head = head.getNext();
            
            if(head != null){
                head.setPrev(null);
            } else {
                // Si head es null, la lista está vacía
                tail = null;
            }
            
            size--;
            return true;
        }
        
        // Buscar el nodo a eliminar
        Nodo actual = head;
        while(actual != null && !actual.getData().getName().equals(nombreB)){
            actual = actual.getNext();
        }
        
        if(actual != null){
            Nodo anterior = actual.getPrev();
            Nodo siguiente = actual.getNext();
            
            // Conectar el nodo anterior con el siguiente
            if(anterior != null){
                anterior.setNext(siguiente);
            }
            
            // Conectar el nodo siguiente con el anterior
            if(siguiente != null){
                siguiente.setPrev(anterior);
            } else {
                // Si no hay siguiente, actualizar tail
                tail = anterior;
            }
            
            size--;
            return true;
        }
        
        return false;
    }
    
    /**
     * Buscar un elemento por nombre
     */
    public Data buscarElemento(String nombreB){
        Nodo temp = head;
        while(temp != null){
            if(temp.getData().getName().equals(nombreB)){
                return temp.getData(); 
            }
            temp = temp.getNext();
        }
        return null;
    }
    
    /**
     * Obtener el tamaño de la lista
     */
    public int getSize(){
        return size;
    }
    
    /**
     * Imprimir la lista de inicio a fin
     */
    public void imprimirLista(){
        Nodo temp = head;
        System.out.println("=== Lista (Head -> Tail) ===");
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    
    /**
     * NUEVO: Imprimir la lista de fin a inicio
     * Esta es una ventaja de las listas dobles
     */
    public void imprimirListaInversa(){
        Nodo temp = tail;
        System.out.println("=== Lista Inversa (Tail -> Head) ===");
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getPrev();
        }
    }
    
    /**
     * NUEVO: Obtener el último elemento
     */
    public Data obtenerUltimo(){
        if(tail != null){
            return tail.getData();
        }
        return null;
    }
    
    /**
     * NUEVO: Obtener el primer elemento
     */
    public Data obtenerPrimero(){
        if(head != null){
            return head.getData();
        }
        return null;
    }
 
}
