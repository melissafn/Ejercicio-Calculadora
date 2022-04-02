
package com.mycompany.ejercicio.calculadora;
import java.util.Scanner;
public class EjercicioCalculadora {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int opc;
        int num1, num2;
        int resp;
        String operacion;
        
        System.out.println("Seleccione la opción que desea realizar");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        
        opc = lector.nextInt();
        
        switch(opc)
        {
            
            case 1:
                System.out.println("Ingrese el primer número");
                num1 = lector.nextInt();
                System.out.println("Ingrese el segundo número");
                num2 = lector.nextInt();
                
                resp = num1 + num2;
                operacion = "Suma";
                System.out.println("El resultado de " + operacion + " es " + resp);
                break;
        }       
    }
}
