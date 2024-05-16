package paquete3;

public class Procesador {

    private String marca;
    private double costo;

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerCosto(){
        return costo;
    }
}
