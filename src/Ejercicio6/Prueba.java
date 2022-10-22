/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ylian
 */
public class Prueba {
    public static void main(String[] args) {
        Edificio nuevo = new Edificio("Edificio de Ejemplo");
        mostrarMenu();
        int opcion = leerOpcion();
        opcionMenu(opcion, nuevo);
    }
    
    public static void mostrarMenu() {
        System.out.println("*******************************************************\n"
                         + "                        Bienvenido                     \n"
                         + "*******************************************************\n"
                         + "Seleccione una opcion del menu: \n"
                         + "1. Ingresar costo de un apartamento. \n"
                         + "2. Calcular el costo total de un piso. \n"
                         + "3. Calcular el costo promedio por apartamento. \n"
                         + "4. Indicar en que piso esta el apartamento mas caro. \n"
                         + "5. Indicar cuantos apartamentos superan un precio dado. \n"
                         + "6. Salir. \n"
                         + "********************************************************\n");
    }
    
    public static int leerOpcion() {
        Scanner in = new Scanner(System.in);
        
        String txtError = "Debe ingresar un numero entero entre el 1 y el 5. \n"
                + "Por favor intente de nuevo: ";
        
        int opcion = 0;
        boolean inputValido = false;
        
        while (!inputValido) {
            try {
                opcion = in.nextInt();
                if (opcion < 1 || opcion > 5) {
                    System.out.println(txtError);
                } else {
                    inputValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(txtError);
                in.nextInt();
            }
        }
        
        return opcion;
    }
    
    public static void opcionMenu(int opcion, Edificio unEdificio) {
        switch (opcion) {
            case 1 -> ingresarCosto(unEdificio);
            case 2 -> calcularCosto(unEdificio);
            case 3 -> System.out.println(unEdificio.costoPromedioPorApartamento());
            case 4 -> System.out.println(unEdificio.pisoConApartamentoMasCaro());
            case 5 -> indicarCuantosSuperan(unEdificio);
        }
        volverAlMenu(unEdificio);
    }
    
    public static void volverAlMenu(Edificio unEdificio) {
        System.out.println("*******************************************************\n"
                + "Desea volver al menu principal? \n"
                + "1. Si \n"
                + "2. No \n"
                + "*******************************************************\n");
        
        int opcion = leerNumero(1, 2);
        
        if (opcion == 1) {
            mostrarMenu();
            int opcion2 = leerOpcion();
            opcionMenu(opcion, unEdificio);
        } 
    }
    
    public static void ingresarCosto(Edificio unEdificio) {
        System.out.println("Ingrese el numero de piso: ");
        int piso = leerNumero(0, 10);
        System.out.println("Ingrese el numero de apartamento: ");
        int apto = leerNumero(1, 4);
        System.out.println("Ingrese el costo del apartamento: ");
        int costo = leerNumero(0, Integer.MAX_VALUE);
        unEdificio.setCosto(piso, apto, costo);
    }
    
    public static void calcularCosto(Edificio unEdificio) {
        System.out.println("Ingrese el numero de piso: ");
        int piso = leerNumero(0, 10);
        System.out.println(unEdificio.costoPiso(piso));
    }
    
    public static void indicarCuantosSuperan(Edificio unEdificio) {
        System.out.println("Ingrese el precio: ");
        int precio = leerNumero(0, Integer.MAX_VALUE);
        System.out.println(unEdificio.cantAptosConPrecioMayor(precio));
    }
    
    public static int leerNumero(int min, int max) {
        Scanner in = new Scanner(System.in);
        
        String txtError = "Debe ingresar un numero entero entre el " +min +  
                           " y el " +max + ".\nPor favor intente de nuevo: ";
        
        int num = 0;
        boolean inputValido = false;
        
        while (!inputValido) {
            try {
                num = in.nextInt();
                if (num < min || num > max) {
                    System.out.println(txtError);
                } else {
                    inputValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(txtError);
                in.nextInt();
            }
        }
        
        return num;
    }
}
