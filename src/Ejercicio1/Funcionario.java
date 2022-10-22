/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Funcionario {
    private String nombre;
    private int sueldo;
    private String telefono;
    
    public Funcionario() {
        this.nombre = "Sin nombre asignado";
        this.sueldo = 0;
        this.telefono = "Sin telefono asignado";
    }
    
    public Funcionario(String unNombre, int unSueldo, String unTelefono) {
        this.nombre = unNombre;
        this.sueldo = unSueldo;
        this.telefono = unTelefono;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getSueldo() {
        return this.sueldo;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public void setSueldo(int unSueldo) {
        this.sueldo = unSueldo;
    }
    
    public void setTelefono(String unTelefono) {
        this.telefono = unTelefono;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " \nSueldo: " + this.sueldo + 
                " \nTelefono: " +this.telefono;
    }

}
