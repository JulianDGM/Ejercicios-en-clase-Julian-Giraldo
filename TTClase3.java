package ttclase3;
import java.util.Scanner;
public class TTClase3 {

    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        int mes = 2;
        
        switch (mes){
            
            case 1: 
                System.out.println("Has elegido Enero");
                break;
            case 2:
                System.out.println("Has elegido Febrero");
                break;
            case 3:
                System.out.println("Has elegido Marzo");
                break;
            default:
                System.out.println("El mes elegido no es valido");
        }
        //Estructuras de repetición:
        //for se utiliza para elementos iterables:
        int [] array = {1,2,3,4,5,6};
        for (int i: array){
            System.out.println("El numero es: "+ i);
                    }
        System.out.println("Fin del for");
        int iterador =0;
        do {
            System.out.println("El numero es "+ iterador);
            iterador++;
        }
       while(iterador <= 10);
        System.out.println("fin de do while");
        
        int j =9;
        while(j<=20){
            System.out.println("El numero es "+ j);
           j++;
        }
        //for
        for (int x =0; x <=12;x++){
            System.out.println("El valor de x es: "+x);
        }
        //while
        int y = 12;
        while(y<=20){
            System.out.println("El valor de y es: "+y);
            y++;
        }
        //do-while
        int f = 2;
        do {
            System.out.println("El valor de f es: "+f);
            f++;
        }while(f<=5);
        
        //Control de flujo en bucles
        for(int u=8;u<=15;u++){
            if (u==13){
                break;
            }System.out.println("El valor de u es: "+u);
        }
         for(int u=8;u<=15;u++){
            if (u==11){
                continue;
            }System.out.println("El valor de u es: "+u);
         }
         // Uso de if
         int edad = 24;
         if(edad>=20){
             System.out.println("Eres mayor de edad");
         }
}
}
