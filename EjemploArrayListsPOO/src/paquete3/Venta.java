
package paquete3;

import java.util.ArrayList;

public class Venta {
    private double valorVenta;
    private ArrayList<Computador> computadoras; 

    
    public Venta ( ArrayList<Computador> c){
   
        
        computadoras =c;
       
    }
    
    
 public void establecerValorVenta() {
    valorVenta = 0;
    for (Computador c : computadoras) {
        valorVenta += c.obtenerCostoComputador();
    }
}  
    public void  establecerComputadoras(ArrayList<Computador> n){
        computadoras=n;
    }
    
    public ArrayList<Computador>  obtenerComputadoras(){
        return computadoras;
    }
    
    public double obtenerValorVenta(){
        return valorVenta;
    }
    
    
}

