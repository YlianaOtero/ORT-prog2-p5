/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ylian
 */
public class Prueba {
//    public static void main(String[] args) {
//        ejemplo2();
//    }
    
    public static Funcionario ejemplo1() {
        System.out.println("Ingrese el nombre del funcionario: ");
        String unNombre = pedirNombre();
        
        System.out.println("Ingrese el sueldo del funcionario: ");
        int unSueldo = pedirSueldo();
        
        System.out.println("Ingrese el telefono del funcionario: ");
        String unTelefono = pedirTelefono();
        
        Funcionario nuevo = new Funcionario(unNombre, unSueldo, unTelefono);
        System.out.println(nuevo.toString());
        
        return nuevo;
    }
    
    public static String pedirNombre() {
        Scanner in = new Scanner(System.in);
        String unNombre = "";
                
        boolean inputCorrecto = false;
        String txtError = "Ingrese un nombre valido. \n Intente otra vez: ";
                
        while (!inputCorrecto) {
            try {
                unNombre = in.nextLine();
                if (!Pattern.matches("[a-zA-Z ]+", unNombre)) {
                    System.out.println(txtError);
                } else {
                    inputCorrecto = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(txtError);
                in.nextLine();
            }
        }
         
        return unNombre;
    }
    
    public static int pedirSueldo() {
        Scanner in = new Scanner(System.in);
        int unSueldo = 0;
                
        boolean inputCorrecto = false;
        String txtError = "Ingrese un sueldo valido. \n Intente otra vez: ";
                
        while (!inputCorrecto) {
            try {
                unSueldo = in.nextInt();
                inputCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println(txtError);
                in.nextLine();
            }
        }
         
        return unSueldo;
    }
    
    public static String pedirTelefono() {
        Scanner in = new Scanner(System.in);
        String unTelefono = "";
                
        boolean inputCorrecto = false;
        String txtError = "Ingrese un telefono valido. \n Intente otra vez: ";
        
        while (!inputCorrecto) {
            try {
                unTelefono = in.nextLine();
                if (!esTelefonoValido(unTelefono)) {
                    System.out.println(txtError);
                } else {
                    inputCorrecto = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(txtError);
                in.nextLine();
            }
        }
         
        return unTelefono;
    }
    
    public static boolean esTelefonoValido(String unTelefono) {
        return Pattern.matches("[0-9]+", unTelefono) && unTelefono.length() == 9 
                && unTelefono.charAt(0) == '0' && unTelefono.charAt(1) == '9';
    }
    
    public static void ejemplo2() {
        Funcionario nuevo1 = ejemplo1();
        Funcionario nuevo2 = ejemplo1();
        
        int sueldo1 = nuevo1.getSueldo();
        int sueldo2 = nuevo2.getSueldo();
        
        if (sueldo1 == sueldo2) {
            System.out.println("Ambos funcionarios ganan lo mismo.");
        } else if (sueldo1 < sueldo2) {
            System.out.println(nuevo2.getNombre() + " gana mas que " + nuevo1.getNombre());
        } else {
            System.out.println(nuevo1.getNombre() + " gana mas que " + nuevo2.getNombre());
        }
    }
}
