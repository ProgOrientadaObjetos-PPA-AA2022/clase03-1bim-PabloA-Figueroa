/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        System.out.println("Ingres el nombre del hospital");
        String nombre1 = entrada.nextLine();
        h1.establecerNombre(nombre1);
        System.out.println("Ingres el numero de camas");
        int ncamas = entrada.nextInt();
        h1.establecerNumeroCamas(ncamas);        
        System.out.println("Ingres el presupuesto");
        double valor1 = entrada.nextDouble();
        h1.establecerPresupuesto(valor1);       
        entrada.nextLine();

        System.out.println("Ingres el nombre del hospital");
        nombre1 = entrada.nextLine();
        h2.establecerNombre(nombre1);
        System.out.println("Ingres el numero de camas");
        ncamas = entrada.nextInt();
        h2.establecerNumeroCamas(ncamas);
        System.out.println("Ingres el presupuesto");
        valor1 = entrada.nextDouble();         
        h2.establecerPresupuesto(valor1);
        entrada.nextLine();
        
        System.out.println("Ingres el nombre del hospital");
        nombre1 = entrada.nextLine();
        h3.establecerNombre(nombre1);
        System.out.println("Ingres el numero de camas");
        ncamas = entrada.nextInt();
        h3.establecerNumeroCamas(ncamas);
        System.out.println("Ingres el presupuesto");
        valor1 = entrada.nextDouble();        
        h3.establecerPresupuesto(valor1);
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        int sumaCamas = h1.obtenerNumeroCamas()+h2.obtenerNumeroCamas() +
                h3.obtenerNumeroCamas();
        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma de Camas es %d\n", sumaCamas);
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(), 
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());
         
        
        
        
        
    }
}
