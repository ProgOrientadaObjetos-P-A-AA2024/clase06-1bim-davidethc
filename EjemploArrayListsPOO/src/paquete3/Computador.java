
package paquete3;

public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
   
   
 public void establecerMarca(String n){
     marca=n;
 }
    
 public void establecerProcesador(Procesador p){
     procesador=p;
 }
     
 public void establecerMemoria(Memoria m){
     memoria=m;
 }
 public void establecerCostoComputador(){
     costoComputador= procesador.obtenerCosto()+memoria.obtenerCosto();
 }
 public String obtenerMarca(){
     return marca;
 }
 public Procesador obtenerProcesador(){
     return procesador;
 }
public Memoria obtenerMemoria(){
     return memoria;
 }
public double obtenerCostoComputador(){
    return costoComputador;
}
}

