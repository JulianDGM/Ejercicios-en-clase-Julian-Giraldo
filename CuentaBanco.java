/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttclase3;
import java.util.Scanner;

public class CuentaBanco {
   // Funciones:
    public static double consultaSaldo(){
        double saldo = 123897.4;
        return saldo;
    }
    
    public static double hacerRetiro(){
        
        Scanner scanner = new Scanner(System.in);
            double valor = scanner.nextDouble();
            scanner.nextLine();
            //hacerlo nosotros
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
            
            if(opcion==4){
                break;
            }
            
            switch(opcion){
                case 1:
                    System.out.println("Consultar Saldo");
                    break;
                case 2:
                    System.out.println("Hacer Retiros");
                    break;
                case 3:
                    System.out.println("Hacer Consignación");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                    
            }
        }        
    }
    
}
