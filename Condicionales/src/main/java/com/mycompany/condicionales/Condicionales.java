
package com.mycompany.condicionales;


public class Condicionales {

    public static void main(String[] args) {
        int dia = 7;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia= "lunes";
                break;
                case 2: nombreDia= "lunes";
                break;
             case 3: nombreDia= "lunes";
                break;
             case 4: nombreDia= "lunes";
                break;
             case 5: nombreDia= "lunes";
                break;
                case 6:
            default: nombreDia= "Dia no encon tado";
                break;
        }
        
        System.out.println("El dia de la semana sellecionado es " + nombreDia);
    }
}
