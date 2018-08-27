/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.cuenta;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;


public class EjercicioCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = lectura.nextInt();
        System.out.println("INgrese la clave");
        int clave = lectura.nextInt();
        System.out.println("Ingrese el dueno");
        String dueno = lectura.next();
        System.out.println("Saldo");
        double saldo = lectura.nextDouble();
        Cuenta c1 = new Cuenta(cuenta,clave,dueno,saldo);
        c1.consignar(100000);
        
    }
    
}
