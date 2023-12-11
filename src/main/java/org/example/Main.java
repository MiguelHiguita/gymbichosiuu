package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreGimnasio="GymBichoSiuuu";
        String nombreCliente;
        String estadoCivilCliente;
        String cedulaCliente;
        String objetivoCliente;
        String costoMensualidad="50000";
        double pesoClienteEnKilogramos;
        double estaturaClienteEnMetros;
        double indiceMasaCorporal;

        Scanner leerDato=new Scanner(System.in);

        System.out.println("ingresa tu nombre");
        nombreCliente=leerDato.nextLine();

        System.out.println("ingresa tu estado civil");
        estadoCivilCliente= leerDato.nextLine();

        System.out.println("ingresa tu numero de cedula");
        cedulaCliente= leerDato.nextLine();

        System.out.println("ingresa tu objetivo");
        objetivoCliente= leerDato.nextLine();

        System.out.println("ingresa tu peso");
        pesoClienteEnKilogramos= leerDato.nextDouble();

        System.out.println("ingresa tu estatura");
        estaturaClienteEnMetros= leerDato.nextDouble();

        System.out.println("ingresa tu indice de masa corporal");
        indiceMasaCorporal=leerDato.nextDouble();


    }
}