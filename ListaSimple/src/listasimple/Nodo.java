
package listasimple;

/**
 *
 * @author UCC
 */
public class Nodo {
    
   Data data;
   Nodo link; //puntero reforencia al nodo nodo siguiente
    
   public Nodo(Data dato){
       this.data = dato;
       link = null;
   }
   
   public Nodo(Data dato, Nodo n){
       this.data = dato;
       link = n;
   }

    public Data getData() {
        return data;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
    
    public Nodo getLink() {
        return link;
    }

  
   
    
}
