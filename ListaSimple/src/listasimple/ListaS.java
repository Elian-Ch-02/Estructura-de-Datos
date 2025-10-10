/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author UCC
 */
public class ListaS {
 
    private Nodo head; //El primer nodo de la lista 
    private int size;// tamaño de la lista
    
    public ListaS(){
        head = null;
        size = 0;
        
    }
    
    public void agregarAlInicio(Data dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setLink(head);
        head = nuevoNodo;
        size ++;
    }
    
    public void agregarAlFinal(Data dato){
       Nodo nuevoNodo = new Nodo(dato);
       if(head == null){
           head = nuevoNodo;
           
       }else{
           Nodo temp = head;
           while(temp.getLink()!= null){
               temp = temp.getLink();
           }
           temp.setLink(nuevoNodo);
       }
       size ++;
    }
    
    public boolean insertarAntesde(Data dato, String nombre){
    if (head == null){
        return false;
    }
    
    if (head.getData().getName().equals(nombre)){
        agregarAlInicio(dato);
        return true;  // agregarAlInicio ya incrementa size
    }
    
    Nodo actual = head;
    Nodo anterior = null;
    
    while (actual != null && !actual.getData().getName().equals(nombre)) {
        anterior = actual;
        actual = actual.getLink();
    }
    
    if (actual != null){
        Nodo nuevoNodo = new Nodo(dato, actual);
        anterior.setLink(nuevoNodo);
        size++;
        return true;
    }
    
    return false;
}
 
    public boolean insertarDespuesde(Data dato, String nombreB){
        Nodo temp = head;
        
        while(temp != null){
                if(temp.getData().getName().equals(nombreB)){
                       Nodo nuevoNodo = new Nodo(dato, temp.getLink());
            temp.setLink(nuevoNodo);
            size++;
            return true;
                }
                temp = temp.getLink();
        }
        return false;
    }
    
    public boolean eliminarElemento(String nombreB){
       if(head == null){
          return false; 
       
    }
    if(head.getData().getName().equals(nombreB)){
    head = head.getLink();
    size--;
    return true;
}
    Nodo actual = head;
    Nodo anterior = null;
    while(actual != null && !actual.getData().getName().equals(nombreB)){
    anterior = actual;
    actual = actual.getLink();
}
    if(actual != null){
    anterior.setLink(actual.getLink());
    size--;
    return true;
}
    return false;
}
    public Data buscarElemento(String nombreB){
        
        Nodo temp = head;
        while(temp != null){
             if(temp.getData().getName().equals(nombreB)){
            return temp.getData(); 
        }
      temp = temp.getLink();
        }
        return null;
    }
    public int getSize(){
        return size;
    }
    
    public void imprimirLista(){
        Nodo temp = head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getLink();
        }
    }

   
    
}