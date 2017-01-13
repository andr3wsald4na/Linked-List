
package lista_simpl_en;

public class Nodo {
    public int dato;
    public Nodo siguiente;
    
//constructor para insertar al final    
    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
    
//constructor para insertar al inicio
    public Nodo(int dato,Nodo n){
        this.dato=dato;
        siguiente=n;
    }
}
