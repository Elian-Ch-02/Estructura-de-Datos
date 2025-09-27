/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labcolas;

/**
 *
 * @author UCC
 */
public class CircularQueue implements IQueue{
    
    private int[]elemntos;
    
    private int front;
    
    private int rear;
    
    private int size;
    
    private int capacity;
    
    public CircularQueue (int capacity){
        this.capacity = capacity;
        elemntos = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        
    }

    @Override
    public void enqueue(int elemnto) {
       if(isFull()){
           System.out.println("Error; la cola esta llena");
       } else{
           rear = (rear + 1 ) % capacity;
           elemntos[rear] = elemnto;
           size++;
       }
    }

    @Override
    public int dequeue() {
      if(isEmpty()){
          System.out.println("Error; la cola esta vacia");
          return -1;
      }  
      int data = elemntos[front];
      front = (front + 1 ) % capacity;
      
      size--;
      
      return data;
    }

    @Override
    public int front() {
        if(isEmpty()){
            System.out.println("La cola esta vacia");
            return - 1;
        }
        return elemntos[front];
    }

    @Override
    public boolean isEmpty() {
      return size ==0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public int size() {
        return size;
    }
    
    
}
