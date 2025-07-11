

package com.mycompany.casoschool;

import java.util.Scanner;


public class CasoSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad del alumno: " );
        try {
            
        int edad = scanner.nextInt();
        if (edad > 4 && edad < 6) {
            System.out.println("Lunes y miercoles  entre las 16 y 17");
        } else if (edad > 7 && edad < 8 ) {
            System.out.println("Martes y jueves de 7 a 8 a;os ");
        } else if ( edad > 9 && edad < 10  ) {
            System.out.println("Martes y jueves entre las 17:30 a 19 ");
        }else if (edad > 11 && edad < 13 ) {
            System.out.println("Lune sy miercoles de 17 a 18:30 ");
        }else {
            System.out.println("Edad no esta en los registrpos");
        }
          } 
        catch (Exception e) {
            System.out.println("Error: por favor ingrese solo números validos");
        }
        
    }
   
}

 