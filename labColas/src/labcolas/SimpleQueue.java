/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labcolas;

/**
 *
 * @author UCC
 */
public class SimpleQueue implements IQueue{
    
    // Arreglo que almacena los elementos de la cola 
    private int[] elemntos;
    
    // indice del primer elemnto(proximo ser extraido con dequeue)
    private int front;
    
    //indice del ultimo elemento insertado
    private int rear;
    
    // capacidad maxima de elementos que puede contener la cola
    private int capacity;
    
    public SimpleQueue(int capacity){
        this.capacity = capacity;       
        elemntos = new int[capacity];   //Crear el arreglo con el tamaño especificado
        front = 0;                      //Inicializa en 0, apuntado al primer elemto
        rear = -1;                      //Inicializa en -1 porque aun no hay elemento
    }
    
      @Override
public void enqueue(int elemnto){
    //verifica si hay espacio disponible
    if (isFull()){
        System.out.println("Error; la cola esta llena ");
    }else{
        elemntos[++rear] = elemnto;
    }
}

    @Override
    public int dequeue() {
        if (isEmpty()){
            System.out.println("Error; la cola esta vacia ");
            return -1;
        }
        return elemntos[front ++];
    }

    @Override
    public int front() {
        if (isEmpty()){
            System.out.println("la cola esta vacia ");
            return -1;
        }
        return elemntos[front];
    }

    @Override
    public boolean isEmpty() {
     return front > rear;   
    }

    @Override
    public boolean isFull() {
     return rear == capacity - 1;
    }

    @Override
    public int size() {
        return (isEmpty()) ? 0 : (rear - front + 1);
    }
    
    
}
