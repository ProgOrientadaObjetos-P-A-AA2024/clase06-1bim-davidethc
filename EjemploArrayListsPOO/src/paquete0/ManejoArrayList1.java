
package paquete0;

import java.util.ArrayList;
import paquete2.Profesor;

public class ManejoArrayList1 {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        // Arreglo
        Profesor [] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
            Profesor p1 =  profesores[i];
            System.out.printf("%s - %s\n", p1.obtenerNombre(),
                    p1.obtenerTipo());
        }
        
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);
        
        for (int i = 0; i < profesores2.size(); i++) {
            Profesor p1 = profesores2.get(i);
            System.out.printf("%s - %s\n", p1.obtenerNombre(),
                    p1.obtenerTipo());
        }
        
        System.out.println("-----------------------------");
        
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        profesores2.add(prof3);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
    }
}
