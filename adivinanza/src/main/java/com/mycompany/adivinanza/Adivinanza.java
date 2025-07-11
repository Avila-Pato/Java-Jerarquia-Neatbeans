

package com.mycompany.adivinanza;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(0,10);
        int intentos = 0;
            
        while(intentos < 5) {
            System.out.println("Introdusca un numero aleatorio entre el 0 al 10");
            int numeroAleatorio = lector.nextInt();
            intentos++;
            
            if(numeroAleatorio == numeroGenerado){
                System.out.println("Felicidades acertaste el numero correcto en " + intentos + " intenos");
                   break;
            } else if (numeroAleatorio < numeroGenerado){
                System.out.println("El numero que escribiste es menor");
            }else {
                System.out.println("El numero que escribiste es mayot");
            }
        }
        if (intentos == 5){
            System.out.println("Lo siento terminaron tus intetnos");
        }
        
    }
}
