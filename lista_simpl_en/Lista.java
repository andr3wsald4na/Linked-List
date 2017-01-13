package lista_simpl_en;

import java.util.ArrayList;

public class Lista {
    
    protected Nodo inicio,fin; //punteros para conocer el inicio y fin
    
    public Lista(){
        inicio=null;
        fin=null;
    }
    
    public boolean estaVacio(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertarInicio(int dato){
        
        inicio=new Nodo(dato, inicio);
        
        if(fin==null){
            fin=inicio;
        }      
    }
    
    public void insertarFinal(int dato){
        
        if(!estaVacio()){
            fin.siguiente=new Nodo(dato);
            fin=fin.siguiente;
        }
        else{
            fin=new Nodo(dato);
            inicio=fin;
        }     
    }
    
    public void BorrarInicio(){
        int dato;
        dato=inicio.dato;
        
        if(inicio==fin){
            inicio=null;
            fin=null;           
        }
        else{
            inicio=inicio.siguiente;
        }        
        System.out.println("El elemento eliminado es: " +dato+"\n");
    }
    
    public void BorrarFinal(){
        int dato=fin.dato;
        
        if(inicio==fin){
            fin=inicio=null;      
        }
        else{
            Nodo aux=inicio;
            while(aux.siguiente!=fin){
                aux=aux.siguiente;
            }
            fin=aux;
            fin.siguiente=null;          
        }
        System.out.println("El elemento eliminado es: " +dato+"\n");
    }
    
    public void BorrarBuscar(int dato){
      
        if(inicio==fin && dato==inicio.dato){
            inicio=fin=null;
        }
        
        //caso en que sea el dato del inicio
        else if(dato==inicio.dato){
           inicio=inicio.siguiente;
        }        
        
        else{
        
            Nodo sig=inicio.siguiente;
            Nodo anterior=inicio;
            
            while(sig!=null && sig.dato!=dato){
                sig=sig.siguiente;
                anterior=anterior.siguiente;
            }
            if(sig!=null){
                anterior.siguiente=sig.siguiente;
            
            if(sig==fin){
                fin=anterior;
            } 
            }
        }
        
    }
    
    public boolean buscarElemento(int dato){
        
        Nodo temporal=inicio;
        while(temporal!=null && temporal.dato!=dato){
            temporal=temporal.siguiente;
        }         
            return temporal!=null;
    }
    
    public ArrayList mostrarListaInicio(){
        
        
        Nodo recorrer=inicio;
        ArrayList al= new ArrayList();
        al.clear();
        
        while(recorrer!=null){           
            //System.out.println(recorrer.dato+"\n");
            al.add(recorrer.dato);
            recorrer=recorrer.siguiente;
        }  
            return al;
            
    }
  
}
