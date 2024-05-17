package paquete3;

public class Memoria {

    private String marca;
    private double costo;
    
    
    
    public Memoria (String n, double c){
        marca = n;
        costo=c;
    }
    public void establecerCosto(double n) {
        costo = n;

}
    public void establecerMarca(String n) {
        marca = n;
    }

    public String obtenerMarca(){
        return marca;
    }
      public double obtenerCosto(){
        return costo;
    }
      
    @Override
    public String toString() {
        return String.format("Memoria: %s, Costo: %.2f", marca, costo);
    }
}

