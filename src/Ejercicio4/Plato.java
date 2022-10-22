/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author ylian
 */
public class Plato {
    private String descripcion;
    private int costo;
    private String codigo;
    private boolean aptoCeliacos;
    
    public Plato(String unaDescripcion, int unCosto, boolean apto) {
        this.descripcion = unaDescripcion;
        this.costo = unCosto;
        this.aptoCeliacos = apto;
        this.codigo = generarCodigo(unaDescripcion);
    }
    
    private static String generarCodigo(String unaDescripcion){
        String codigo = "";
        unaDescripcion = unaDescripcion.toUpperCase();
        
        for (int i = 0; i < unaDescripcion.length() && codigo.length() < 4; i++) {
            char letra = unaDescripcion.charAt(i);
            if (esConsonante(letra)) {
                codigo += letra;
            }
        }
        
        while (codigo.length() < 4) {
            codigo += "-";
        }
        
        return codigo;
    }
    
    private static boolean esConsonante(char letra) {
        String consonantes = "BCDFGHJKLMNÑPQRSTVWXYZ";
        
        return consonantes.contains(String.valueOf(letra));
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public boolean esAptoParaCeliacos() {
        return this.aptoCeliacos;
    }
    
    public int getCosto() {
        return this.costo;
    }
    
    public void setDescripcion(String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }
    
    public void setCosto(int unCosto) {
        this.costo = unCosto;
    }
    
    public void setAptoCeliacos(boolean apto) {
        this.aptoCeliacos = apto;
    }
    
    @Override
    public String toString() {
        String aptitud = "si";
        if (!this.aptoCeliacos) {
            aptitud = "no";
        }
        
        return "Descripcion del plato: " +this.descripcion +"\nCosto: " 
                +this.costo +" $\nCodigo: " + this.codigo + "\nApto para celiacos: "
                +aptitud + "\n";
    }
}
