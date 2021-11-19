/*
    Crea un programa que descomponga un numero pedido en factores primos.
    Realizar todas las comprobaciones de contorno necesarias.
 */
package dam1campostello_daniel_ejercicio039905descomponerprimos;

import java.util.*;

public class DAM1CamposTello_Daniel_Ejercicio039905DescomponerPrimos {

    public static void main(String[] args) {
        
        Scanner recoge = new Scanner(System.in);
        
        System.out.print("Introduce un numero > 1 y lo descompondre en factores primos: ");
        
        int numero = recoge.nextInt();

        int primo = 1;
        
        do{//do while que se repite mientras numero sea mayor que 1
            
            while(primo < numero){//while que se repite mientras primo sea menor que numero
                
                 primo ++; //sumamos  1 a primo
                
                if (numero % primo == 0){//mientras el  resto de la division de numero entre primo sea == 0 se imprime
                    
                    System.out.printf("%-4d | %4d \n", numero , primo);

                    numero /= primo;//igualamos el resultado de numero a numero/primo
                    
                    primo = 1;//reseteamos primo para que vuelva a empezar
  
                }       
            }
     
        }while(numero > 1);
        
        System.out.printf("%-4d | %4d\n", 1,1);
        

           
      
        
        
        
    }
    
}
