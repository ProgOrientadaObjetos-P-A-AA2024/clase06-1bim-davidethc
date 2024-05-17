package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de computadoras a comprar:");
        int computadoras = sc.nextInt();
        sc.nextLine();  // Consumir la nueva línea
        ArrayList<Computador> compus = new ArrayList<>();

        for (int i = 0; i < computadoras; i++) {
            // Marca del computador
            System.out.println("Ingrese la marca de su computador:");
            String marca = sc.nextLine();
            
            // Procesador       
            System.out.println("Ingrese el tipo de procesador:");
            String pro = sc.nextLine();
            System.out.println("Ingrese el precio del procesador en $:");
            double pro1 = sc.nextDouble(); 
            sc.nextLine();  // Consumir la nueva línea
            Procesador prof = new Procesador(pro, pro1);
            
            // Memoria           
            System.out.println("Ingrese el tipo de memoria:");
            String s = sc.nextLine();        
            System.out.println("Ingrese el precio de la memoria:");
            double s1 = sc.nextDouble(); 
            sc.nextLine();  // Consumir la nueva línea
            Memoria memoria = new Memoria(s, s1);

            // Crear objeto Computador
            Computador c1 = new Computador(prof, memoria);
            c1.establecerMarca(marca);
            c1.establecerCostoComputador();
            compus.add(c1);
        }

        Venta venta1 = new Venta(compus);
        venta1.establecerValorVenta();

        // Mostrar la información de las computadoras y el valor total de la venta
        System.out.println("Computadoras adquiridas:");
        for (Computador c : compus) {
            System.out.println(c);
        }
        System.out.println("Valor total de la venta: $" + venta1.obtenerValorVenta());
    }
}