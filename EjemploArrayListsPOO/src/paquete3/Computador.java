package paquete3;

import java.util.ArrayList;

public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;
    private ArrayList<Computador> compu;
    
    
    
    

    public Computador( Procesador p,Memoria m) {
        
        procesador=p;
        memoria=m;
     
        
    }

    
  
    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria m) {
        memoria = m;
    }

   public void establecerCostoComputador() {
    costoComputador = procesador.obtenerCosto() + memoria.obtenerCosto();
}



    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public double obtenerCostoComputador() {
        return costoComputador;
    }
    public ArrayList<Computador> obtenerCompu(){
        return compu;
    }
    @Override
    public String toString() {
        return String.format("Marca: %s, Procesador: %s, Memoria: %s, Costo: %.2f",
                marca, procesador, memoria, costoComputador);
    }
}


