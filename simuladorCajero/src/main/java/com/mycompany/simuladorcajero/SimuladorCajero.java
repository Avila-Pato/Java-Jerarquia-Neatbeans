package com.mycompany.simuladorcajero;

import java.util.Scanner;

public class SimuladorCajero {

    public static void main(String[] args) {
        double saldo = 199.0992;

//- Escriba el numero de la opcion deseada
// 1- Consultar saldo
// 2- Retirar
// 3- Depositar
// 4- Salir
        System.out.println("ingrese uan opcion deseada");
        System.out.println("1>Consultar saldo\n2>Retirar\n3>Depositar>\n4>Salir");
        Scanner lector = new Scanner(System.in);
        int opc = lector.nextInt();

        while (opc == 4) {

            if (opc == 1) {
                System.out.println("su saldo actual es " + saldo);
            } else if (opc == 2) {
                System.out.println("Cuanto desea retirar?");
                int retirarSaldo = lector.nextInt();
                saldo -= retirarSaldo;
                System.out.println("Se han retirado " + retirarSaldo + " De su cuenta actualmente tiene " + saldo);
            } else if (opc == 3) {
                System.out.println("Ingrese la cantidad que desea ingresar");
                int IngresarDinero = lector.nextInt();
                saldo += IngresarDinero;
                System.out.println("Se han depositado " + IngresarDinero + "a su cuenta " + saldo);
            } else {
                System.out.println("Ingrese una opcion valida");
            }

        }
        if (opc == 4) {
            System.out.println("saliendo del programa");
        }

    }
}
