/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttclase3;
import java.util.Scanner;

public class CuentaBanco {
   //Atributos clase
    public static double totalCuenta=123897.4;

// Funciones:
    public static double consultaSaldo(double totalCuenta){
        double saldo = totalCuenta;
        return saldo;
    }
    
    public static double hacerRetiro(double saldo){
        
        Scanner scanner = new Scanner(System.in);
            double valor = scanner.nextDouble();
            System.out.println("¿Cuánto desear retirar?");
            scanner.nextLine();
            
            if (saldo>=valor){
                saldo -=valor;
                System.out.println("Retiro exitoso, su nuevo saldo es: " +saldo);
                } else {
                System.out.println("Saldo insuficiente.");
            }
            return valor;
    }
        //Método Main:
    public static void main(String[] args){
       
        while(true){
            String Usuario = "Samuel Torres";
            System.out.println("Hola "+Usuario+"\n");
            System.out.println("¿Qué deseas hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");
            
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            double saldoActual = consultaSaldo(totalCuenta);
            if(opcion==4){
                System.out.println("¡Gracias por usar nuestro sistema! Adiós.");
                break;
            }            
            switch(opcion){
                case 1:
                    System.out.println("\n---Consultar Saldo---");
                    System.out.println("Su saldo actual es: "+ saldoActual+"\n1. Volver.\n2. Terminar.");
                    int opcion_1 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion_1==2){
                    System.out.println("¡Gracias por usar nuestro sistema! Adiós.");
                    break;
                    }else if(opcion_1==1){
                        break;
                    }
                case 2:
                    System.out.println("\n---Hacer Retiros---");
                    System.out.println("¿Cuánto deseas retirar?");
                    
                        
                    break;
                case 3:
                    System.out.println("Hacer Consignación");
                    break;
                default:
                    System.out.println("La opción elegida no es valida");                 
            }             
        }        
    }
    
}
