
package com.mycompany.condicionales;

import java.util.Scanner;


public class Lectura {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribr el nombre de tu pelicula favorita");
        
        String pelicula = teclado.nextLine();
        
        System.out.println("Ahora escribe su fecha de lanzamiento");
        
        int fechaDeLanzamiento = teclado.nextInt();
        
        System.out.println("Por ultimo dinos la nota que creas tu que estima");
        
        double notaPelicula = teclado.nextDouble();
        
        System.out.println(String.format("La película es %s, su fecha de lanzamiento es %d y su nota es %.1f", pelicula, fechaDeLanzamiento, notaPelicula));

    }
    
}
