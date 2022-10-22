/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.awt.font.NumericShaper.Range;
import java.util.regex.Pattern;

/**
 *
 * @author ylian
 */
public class Queja {
    private String denuncia;
    private String direccion;
    private String telefono;
    private int numero;
    
    private static int UltimoNumero = 0;
    
    public Queja(String unaDenuncia, String unaDireccion, String unTelefono) {
        this.denuncia = unaDenuncia;
        this.direccion = unaDireccion;
        if (esTelefonoValido(unTelefono)) {
            this.telefono = unTelefono;
        } else {
            this.telefono = "000000000";
            System.out.println("ERROR: telefono invalido. \n"
                    + "Puede modificar el telefono con setTelefono()");
        }
        this.numero += UltimoNumero;
    }
    
   private static boolean esTelefonoValido(String unTelefono) {
        return Pattern.matches("[0-9]+", unTelefono) && unTelefono.length() == 9 
                && unTelefono.charAt(0) == '0' && unTelefono.charAt(1) == '9'
                && unTelefono.charAt(2) != '0';
    }
   
    public String getDenuncia() {
        return this.denuncia;
    }
    
    public void setDenuncia(String unaDenuncia) {
        this.denuncia = unaDenuncia;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String unTelefono) {
        if (esTelefonoValido(unTelefono)) {
            this.telefono = unTelefono;
        } else {
            this.telefono = "000000000";
            System.out.println("ERROR: telefono invalido. \n"
                    + "Puede modificar el telefono con setTelefono()");
        }
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public int getUltimoNumero() {
        return UltimoNumero;
    }
   
}
