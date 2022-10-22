/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author ylian
 */
public class Socio {
    private static int ProximoNumero = 0;
    
    private String nombre;
    private final int numero;
    
    public Socio(String unNombre) {
        this.nombre = unNombre;
        ProximoNumero++;
        this.numero = ProximoNumero;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    @Override
    public String toString() {
        return "Nombre: " +this.nombre +"\n Numero: " +this.numero;
    }
}
