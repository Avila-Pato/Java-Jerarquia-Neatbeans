
package com.mycompany.programcionorientadaaclases;


public class ProgramcionOrientadaAclases {

    public static void main(String[] args) {
        Pelicula mielicula = new Pelicula();
        
        mielicula.nombre = "Encanto";
        mielicula.fechaDeLanzamienti = 1992;
        mielicula.duracionMinutos = "2 Horas";
        
        System.out.println("Mi primera pelicula fue " + mielicula.nombre);
        System.out.println("LA fecha de lanzamineto fue en " + mielicula.fechaDeLanzamienti);
        
        
//        Creando otra instancia de la clase 
        Pelicula miotraPelicula = new Pelicula();
        miotraPelicula.nombre = "Al filo del tomorrow";
        miotraPelicula.fechaDeLanzamienti = 2012;
        System.out.println("Mi pelicual favorita es " + miotraPelicula.nombre + "Y salio el a;o " + miotraPelicula.fechaDeLanzamienti);
        
        
        Person persona = new Person();
        
        persona.name = "Patricio";
        persona.age = 23;
        persona.gender = "Masculino";
        
        System.out.println("Mi nombre es" + persona.name);
        System.out.println("Mi edad es " + persona.age);
        System.out.println("Mi genero es " + persona.gender);
        
        
        
    }
}
